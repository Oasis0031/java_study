package whileTask;

import java.util.Scanner;

// 사용자에게 무한 입력 상태로 
// 입력 받은 모든 값의 합이 100 이상되면 프로그램이 종료된다.
// 그리고 입력 받은 모든 값은 순서대로 출력한다
// ex)
// 10
// 50
// 30
// -20
// 10
// 20

// 프로그램 종료
// 입력값: 10, 50, 30, -20, 10, 20
public class WhileTask02 {
   public static void main(String[] args) {
      
	   int target = 100, input = 0, sum = 0;
	   
	   Scanner scan = new Scanner(System.in);
	   
	   while(true) {
		   System.out.println("정수를 입력하세요.");
		   input = scan.nextInt();
		   sum += input;
		   System.out.println(sum);
		   System.out.println(input);
		   if(sum == target) {
			   System.out.println("에에 성공");
			   break;
		   }
	   }
	   
	   
   }
}
