package fr.imtld.time;

import java.io.IOException;


public class MultiWatch {
    
	public static void main(String args[] ) {
 
		for(int i=0;i<10;i++) {
			try {
				System.out.println("this is "+i+" running ");
				new Watch().displayServerTime(args[0]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}