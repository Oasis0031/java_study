package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		// 서버메세지 클라이언트 메세지 설정
		String clientMessage = null, serverMessage = null;
		System.out.println("서버 시작. 클라이언트 대기 중");

		// try문으로 서버소켓 소켓 버퍼리더 버퍼라이터 스캐너 설정
		// 서버소켓에는 포트번호 설정
		try (
				ServerSocket serverSocket = new ServerSocket(1000);
				// 통신용 소켓 리스닝포트
				Socket socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {
			
			System.out.println("클라이언트 접속 됨.");
			
			//while문으로 메세지 수신 설정
			while(true) {
				System.out.println("클라이언트로 메세지 보내기");
				serverMessage = sc.nextLine();
				bufferedWriter.write(serverMessage + "\n");
				bufferedWriter.flush();
				System.out.println("서버: " + serverMessage);
				
				clientMessage = bufferedReader.readLine();
				System.out.println("클라이언트: " + clientMessage);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
