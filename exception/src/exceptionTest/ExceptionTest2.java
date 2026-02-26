package exceptionTest;

import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "채팅을 입력하세요.", input = null;
	
		System.out.println(message);
		
		try {
			input = sc.nextLine();
			if(input.contains("바보")) {
				throw new CurseException("바보는 비속어입니다.");
			} 
			
			System.out.println(input);
		} catch (CurseException e) {
			e.printStackTrace();
		}
	
	
	
	}
}
