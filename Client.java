package ChatProject_repeat1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {

			Socket socket = null;
			
			try {
				socket = new Socket("192.168.0.131", 7777);
				
				Sender sender = new Sender(socket);
				Reciever reciever = new Reciever(socket);
				
				sender.start();
				reciever.start();
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
