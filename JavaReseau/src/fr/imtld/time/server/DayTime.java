package fr.imtld.time.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DayTime implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayTime dt = new DayTime();
		dt.serve();
	}

	void serve() {
		try {
			ServerSocket sockSvr = new ServerSocket(2013);
			while (true) {
				Socket sock = sockSvr.accept();
				System.out.println("Un client s'est connecté");
		        Service service = new Service(sock);
		        Thread thr = new Thread(service);
		       // service.run();
		        thr.start();
//				OutputStream os = sock.getOutputStream(); // Returns an output stream for this socket.
//				PrintWriter pw = new PrintWriter(os, true); // PrintStream主要操作byte流，而PrintWriter用来操作字符流。读取文本文件时一般用后者。
//				String strDateTime = new Date().toString();
//				pw.println(strDateTime);
//				pause(1000);
//
//				pw.close();
//
//				System.out.println("Taper entree pour quitter");
//				Thread thr = new Thread(this);
//				thr.start();
//				// thr.run();
//				System.in.read();
//				sockSvr.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	protected void pause(long ms) {
//		synchronized (this) {
//			try {
//				wait(ms);
//				// Thread.sleep(ms);
//			} catch (InterruptedException e) {
//			}
//		}
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}


}
