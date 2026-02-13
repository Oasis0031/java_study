package methodTask;

import java.util.Scanner;

public class MethodTask04 {
	
//     1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
	double[] devideLeft() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("두 정수를 입력하세요.");
	double[] target = new double[2];
	double num1 = sc.nextDouble();
	double num2 = sc.nextDouble();
	
	double devide = num1 / num2; 
	double left = num1 % num2;
	
	target[0] = devide;
	target[1] = left;
	
	System.out.println("몫 : " + target[0]);
	System.out.println("나머지 : " + target[1]);
	
	return target;
	
	}
	
//     2. 사용자가 입력하는 값중 정수 분리하기
//     입력 예시)
//     안1녕2하3세4요
//     출력 예시)
//     1234
	
	
	int[] intFilter() {
	Scanner sc = new Scanner(System.in);
	System.out.println("문자를 입력하면, 정수만 분리돼요!");   
	String input = sc.nextLine();
	String[] spInput = input.split("");
	
	return result;
	}
	
	public static void main(String[] args) {
      
		MethodTask04 mt4 = new MethodTask04();
		mt4.devideLeft();
	
		
		
		
     
//     3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//     입력 예시) apple
//     찾을 글자 p
//     반환 2
     
//     4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
     
//     5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
     
//     6. 연속된 중복 문자 제거하기
//     입력 예시1)
//     abbbbacda
//     출력 예시1)
//     aacda
     
//     입력 예시2)
//     aabbccccd
//     출력 예시2)
//     abcd
	   
	   
	   
	   
	   
	   
	   
//      사용자는 1 ~ 999까지만 입력가능
      
//      마스터
//      1. 소수 변환기
//      사용자의 입력값을 읽어 문자열로 출력하시오
//      입력 예시1)
//      12.34
//      출력 예시1)
//      십이점삼사
      
//      입력 예시2)
//      -57
//      출력 예시2)
//      마이너스오십칠
      
//      -237.27
//      마이너스이백삼십칠점이십칠
   }
}
