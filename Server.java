package ChatProject_repeat1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		
		
		try {
			serverSocket = new ServerSocket();
			socket = serverSocket.accept();
			
			Sender sender = new Sender(socket);
			Reciever reciever = new Reciever(socket);
			
			sender.start();
			reciever.start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
