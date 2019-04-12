package fr.imtld.time.server;

import java.io.*;
import java.net.Socket;
import java.util.*;

public class Service implements Runnable{
	private Socket sock;
	public Service(Socket sock)  {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		synchronized(this) {
		try {
			
			OutputStream os = sock.getOutputStream(); //Returns an output stream for this socket.
			PrintWriter pw = new PrintWriter(os, true); //PrintStream��Ҫ����byte������PrintWriter���������ַ�������ȡ�ı��ļ�ʱһ���ú��ߡ�
			String strDateTime = new Date().toString();
			pw.println(strDateTime);
			pause(10000);
			
			pw.close();
			
//			System.out.println("Taper entree pour quitter");
////			Thread thr = new Thread(this);
////			thr.start();
//			//thr.run();
			System.in.read();
			sock.close();
			System.out.println("connection ferme");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

	}
	
	protected void pause(long ms) {
		synchronized (this) {
			try {
				wait(ms);
				//Thread.sleep(ms);
			} catch (InterruptedException e) {
			}
		}
	}
}
