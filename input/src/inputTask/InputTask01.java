package inputTask;

// Ctrl + Shift + O
import java.util.Scanner;

public class InputTask01 {
   public static void main(String[] args) {
      // Scanner를 사용하여, 두 정수를 입력 받고,
      // 덧셈 결과를 출력하시오.
      // 단 next()만 사용
      Scanner sc = new Scanner(System.in);
      String message = "두 정수를 입력하세요.\nex)10 20",
            result = "%d + %d = %d";
      int num1 = 0, num2 = 0;
      
      System.out.println(message);
      num1 = Integer.parseInt(sc.next());
      num2 = Integer.parseInt(sc.next());
      System.out.printf(result, num1, num2, num1 + num2);
      sc.close();
   }
}
