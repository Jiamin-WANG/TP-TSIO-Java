package fr.imtld.time;
import java.net.InetAddress;
import java.io.*;
import java.net.*;
import java.util.*;

public class Watch {

    public static void main(String args[] ) throws IOException {
            Watch watch = new Watch();
           if (args.length==0) {
        	   System.out.println(args.length); 
				watch.displayLocalTime();   
           } 
           else if (args.length==1) {
        	   System.out.println(args.length);
        	   watch.displayServerTime(args[0]);
           }
           else System.out.println("Usage: java fr.imtld.time.Watch <daytime_server>");
            //在包下的类，在Java源文件的地方编译后，需要到最外层包的上一级目录下运行，而且类前面需要带包名
           
    }
    
    public Watch() {
    	
    }
    
    protected void displayLocalTime() {
    	Date thisdate = new Date();
            System.out.println(thisdate);
    }
    
   protected void displayServerTime(String strServer) throws IOException  {
    	
    	
    	InetAddress addr = InetAddress.getByName(strServer);
    	//getByName return InetAddress[]
    	Socket sock = new Socket(addr, 2013);
    	System.out.println("Connexion au serveur établie");
    	InputStream is = sock.getInputStream(); //Returns an input stream for this socket
    	InputStreamReader isr = new InputStreamReader( is );
    	BufferedReader br = new BufferedReader( isr );
    	String strDateTime = br.readLine();
    	System.out.println(strDateTime);
    	
    	sock.close();
    	
    }
    
    
}