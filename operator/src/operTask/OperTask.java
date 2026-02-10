package operTask;

import java.util.Scanner;

public class OperTask {
   public static void main(String[] args) {
      // 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
      // 총점과 평균을 구한다.
      // 성적이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
      // 단 if문을 사용하지 않는다.
      // 평균은 소수점 2번째 자리까지만 표기한다.
	   
	   int mathScore = 0, engScore = 0, korScore = 0, total = 0;
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.println("시험 점수를 입력하세요. 수학, 국어, 영어");
	   mathScore = scan.nextInt();
	   korScore = scan.nextInt();
	   engScore = scan.nextInt();
	   
	   total = mathScore + engScore + korScore;	
	   double average = total / 3.0;
	   
	   String pass = "합격", fail = "불합격", akaten = "재평가";
	   
	   String examResult = average > 60 ? pass : (average < 60 ? fail : akaten) ; 
	   
	   System.out.println("총점 : " + total);
	   System.out.printf("평균 : %.2f ", average);
	   System.out.println("");
	   System.out.println("결과 : " + examResult);
	   scan.close();
   }
}
