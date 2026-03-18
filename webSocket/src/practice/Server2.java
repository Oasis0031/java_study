package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
	public static void main(String[] args) {
		String clientMessage = null, serverMessage = null;
		System.out.println("서버 시작. 클라이언트를 기다리는 중");

		// try-catch
		try (
				// 서버 소켓에는 포트 번호
				ServerSocket serverSocket = new ServerSocket(1000);
				Socket socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {
			System.out.println("클라이언트 연결 됨.");

			while (true) {
				System.out.println("메세지를 입력하세요.");
				serverMessage = sc.nextLine();
				bufferedWriter.write(serverMessage);
				bufferedWriter.flush();
				System.out.println("서버 :" + serverMessage + "\n");

				clientMessage = bufferedReader.readLine();
				System.out.println("클라이언트 :" + clientMessage + "\n");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}