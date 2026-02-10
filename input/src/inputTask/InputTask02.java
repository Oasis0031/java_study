package inputTask;

import java.util.Scanner;

public class InputTask02 {
   public static void main(String[] args) {
//      사용자가 입력한 정수 또는 실수의 값이
//      정수인지 실수인지 확인 후 출력하는 로직을 구현하세요.
//      출력 예시)
//      10 -> 정수
//      10.5 -> 실수
//      10.0 -> 실수
	   Scanner sc = new Scanner(System.in);
	   String message = "정수 또는 실수를 입력하세요.", resultDoubleMessage = "실수입니다.", resultIntMessage = "정수입니다.";
	   System.out.println(message);
	   
	   String input = sc.next();
	   
	   if (input.contains(".")) {
		   System.out.println(resultDoubleMessage);
	   } else {
		   System.out.println(resultIntMessage);
	   }
	   
	   sc.close();
   }
}
