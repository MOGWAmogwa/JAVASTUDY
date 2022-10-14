package ChatProject_repeat1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Reciever extends Thread {
	Socket socket;
	DataInputStream in ;
	
	Reciever(Socket socket){
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		
		while(in != null) {
			try {
				
				System.out.println(in.readUTF());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
