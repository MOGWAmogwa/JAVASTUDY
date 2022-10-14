package ChatProject_repeat1;

import java.util.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Sender extends Thread {
	String name;
	String nickName;
	DataOutputStream out;
	Socket socket;

	public Sender(Socket socket) {
		Scanner in = new Scanner(System.in);
		System.out.println("사용하실 닉네임을 입력하여 주십시오.");
		this.nickName = in.next();
		this.socket = socket;
		
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getPort() + " : " + socket.getInetAddress() + " " + nickName + "]";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + sc.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
	
	
	
	
}
