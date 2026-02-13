package methodTask;

import java.util.Scanner;

public class MethodTask03 {
   public static void main(String[] args) {

//      번외 로또 추첨하기
//      로또 번호 6개를 배열에 담아서 결과를 반환해주는 메서드
//      int[] lotto = new int[6];
//      for(int i = 0; i < 6; i++) {
//         lotto[i] = (int)Math.floor(Math.random() * 45);
//         System.out.print(lotto[i] + " ");
//      }
      
//      단 반드시 배열을 사용해야 함
//      1. 한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
//      Scanner sc = new Scanner(System.in);
//      String message = "정수로 바꿀 글자를 입력하세요.\nex)일공이사",
//            hangles = "공일이삼사오육칠팔구", result = "";
//      String[] hangle = null;
//      
//      System.out.println(message);
//      hangle = sc.nextLine().split("");
//      
//      for(int i = 0; i < hangle.length; i++) {
//         result += hangles.indexOf(hangle[i]);
//      }
//      
//      System.out.println(result);
      
//      2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
      Scanner sc = new Scanner(System.in);
      String message = "한글로 바꿀 정수를 입력하세요.\nex)1024",
            hangles = "공일이삼사오육칠팔구", result = "";
      String[] hangle = null;
      
      System.out.println(message);
      hangle = sc.nextLine().split("");
      for(String s: hangle) {
         result += hangles.charAt(Integer.parseInt(s));
      }
      
      System.out.println(result);
      
      
      
      
      
   }
}

















