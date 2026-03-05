package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
// 			누구에게 접속할 것인지의 ip, port
		String serverIp = "192.168.5.12";
		int port = 1100;
		Scanner sc = new Scanner(System.in);

		try (Socket socket = new Socket(serverIp, port);
			 PrintWriter writer = new PrintWriter(socket.getOutputStream())) {
			System.out.println("서버가 연결되었습니다.");
			
			String message = sc.nextLine();
			writer.println(message);
			
			System.out.println("서버로 [" + message + "]를 전송했습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
