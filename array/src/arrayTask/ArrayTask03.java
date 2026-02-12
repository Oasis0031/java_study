package arrayTask;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
//      플래티넘
//      1. 사용자의 입력값을 변환
//      사용자에게 입력 받은 문자열 중 소문자는 대문자로, 대문자는 소문자로 변환하여 출력
//      입력 예시) 안녕hi!
//      출력 예시) 안녕HI!

		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", lowerCase = "abcdefghijklmnopqrstuvwxyz",
				message1 = "텍스트를 입력하세요. 영문 소문자는 대문자로 치환됩니다.", input = null, result = "";
		System.out.println(message1);
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		String[] letter = input.split("");

		for (int i = 0; i < letter.length; i++) {
			String target = letter[i];
			boolean flag = false;

			for (int j = 0; j < lowerCase.length(); j++) {
				if (target.equals(String.valueOf(lowerCase.charAt(j)))) {
					result += upperCase.charAt(j);
					flag = true;
					break;
				}
			}

			for (int j = 0; j < lowerCase.length(); j++) {
				if (target.equals(String.valueOf(upperCase.charAt(j)))) {
					result += lowerCase.charAt(j);
					flag = true;
					break;
				}
			}

			if (!flag) {
				result += target;
			}
		}
		System.out.println(result);

		//      2. 사용자가 입력한 모든 값을 반대로 뒤집어서 모두 배열에 담고 결과를 출력
//      입력 예시) apple
//      출력 예시) elppa
//      Scanner sc = new Scanner(System.in);
//      String message = "반대로 뒤집을 글자를 입력하세요.", input = null;
//      char[] result = null;
//      
//      System.out.println(message);
//      input = sc.nextLine();
//      result = new char[input.length()];
//      
//      for(int i = 0; i < input.length(); i++) {
//         result[i] = input.charAt(input.length() - i - 1);
//         System.out.print(result[i]);
//      }
   }
}
