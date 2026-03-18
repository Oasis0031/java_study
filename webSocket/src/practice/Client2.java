package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) {
		String clientMessage = null, serverMessage = null;
		String serverIp ="";
		int port = 1000;
		
		// try-catch
		try (
				// 서버 소켓에는 포트 번호
				Socket socket = new Socket(serverIp, port);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {
			System.out.println("클라이언트 연결 됨.");

			while (true) {
				System.out.println("메세지를 입력하세요.");
				clientMessage = sc.nextLine();
				bufferedWriter.write(clientMessage);
				bufferedWriter.flush();
				System.out.println("클라이언트 :" + serverMessage + "\n");

				serverMessage = bufferedReader.readLine();
				System.out.println("서버 :" + clientMessage + "\n");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}