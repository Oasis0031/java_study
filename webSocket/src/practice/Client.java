package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		String serverIp = "";
		int port = 1100;
		String clientMessage = null, serverMessage = null;
		
		try (
				Socket socket = new Socket(serverIp, port);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {
			
			System.out.println("클라이언트 서버에 접속 됨.");
			
			//while문으로 메세지 수신 설정
			while(true) {
				//클라이언트가 보내야하니까 서버와 설정 반대로.
				System.out.println("서버로 메세지 보내기");
				clientMessage = sc.nextLine();
				bufferedWriter.write(clientMessage + "\n");
				bufferedWriter.flush();
				System.out.println("클라이언트: " + clientMessage);
				
				serverMessage = bufferedReader.readLine();
				System.out.println("서버: " + serverMessage);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
