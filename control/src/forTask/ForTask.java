package forTask;

import java.util.Scanner;

public class ForTask {
   public static void main(String[] args) {
//      1~10까지 반복 후 5~8을 제외하고 출력
//      for(int i = 0; i < 6; i++) {
//         int value = i + 1;
//         System.out.println(value > 4 ? value + 4 : value);
//      }
      
//      브론즈
//      1. 1~100까지 출력	   
	   for(int i = 0; i < 100; i++) {
		   int value = i + 1;
		   System.out.println(value);
	   }
	   
//      2. 100~1까지 출력
	   for(int i = 0; i < 100; i++) {
		   int value = 100 - i;
		   System.out.println(value);
	   }
      
//      골드
//      1. 1~10까지 누적합을 출력
	   
	   int value = 0;
	   for(int i = 0; i < 10; i++) {
		   value += i +1 ;
	   }
	   System.out.println(value);
	  
//      2. 1~n까지 누적합 출력
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   int valueSecond = 0;
	   for(int i = 0; i < n; i++) {
		   valueSecond += i + 1;
	   }
	   System.out.println(valueSecond);
	   scan.close();
      
//      플레티넘
//      1. A~F까지 출력
	   for(int i = 0; i < 6; i++) {
		   System.out.println((char)('A' + i));
	   }
//      2. A~F까지 중 C를 제외하고 출력
	   for(int i = 0; i < 6; i++) {
		   char charResult = (char)('A' + i);
		   
		   System.out.print(charResult == 'C' ? "" : charResult );
	   }
	   	   System.out.println();

//      다이아
	   
//      1. aBcDeFg...Z 출력
	   	for(int i = 0; i < 26; i++){
	   		char charResult = (char)('A' + i);
	   		char smallCharResult = (char)('a' + i);
	   		String result = "%s%s";
	   		System.out.printf(result, charResult, smallCharResult);
	   	}
	   		System.out.println();
	   		
//      2. 별찍기 
//        *
//       ***
//      *****
	   
//	   System.out.println("  *  ");
//	   System.out.println(" *** ");
//	   System.out.println("*****");
	   		
	  int rows = 30;
	  
	  for(int i = 0; i < rows; i++) {
		  for(int j = 0; j < rows - i - 1; j++) {
			  System.out.print(" ");
		  }
		  
		  for (int k = 0; k < (2 * i + 1); k++) {
			  System.out.print("*");
		  }
		  
		  System.out.println();
	  }
	  
	  
//      마스터
//      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
//      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//      입력 예시) a1b3c2
//      출력 예시) abbbcc
	  Scanner sc = new Scanner(System.in);
      
      System.out.println("문자와 반복 횟수를 입력하세요. (예: a1b3c2)");
      String input = sc.next(); 
	   
	  for (int i = 0; i < input.length(); i += 2) {
		    char alphabet = input.charAt(i);
		    
		    char countChar = input.charAt(i + 1);
		    int count = countChar - '0'; 
		    
		    for (int j = 0; j < count; j++) {
		        System.out.print(alphabet);
		    }
		}
	   
      
//        2. 사용자가 입력한 횟수가 얼마인지 모르고,
//    입력한 횟수 만큼 문자를 만들어주는 프로그램
//    입력 예시) a1b22c357
//    출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
    Scanner scanning = new Scanner(System.in);
    String message = "문자 + 숫자 형식의 문자열을 입력하세요.\nex)a1b22c347",
          inputer = null, result = "";
    
    System.out.println(message);
    input = sc.next();
    
    for(int i = 0; i < input.length(); i++) {
       char c = input.charAt(i); // 문자
       
       String numberStr = "";
       i++;
//       다음 문자부터 숫자 읽기 시작
       while(i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
          numberStr += input.charAt(i);
          i++;
       }
       
       int count = Integer.parseInt(numberStr);
       
       for(int j = 0; j < count; j++) {
          result += c;
       }
       i--;
    }
    
    System.out.println(result);
 }
}















