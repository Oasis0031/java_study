package arrayTask;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
//      브론즈
//      1. 1~100까지 배열에 담은 후 홀수만 출력

		int[] arrayFirst = new int[100];

		for (int i = 0; i < arrayFirst.length; i++) {
			arrayFirst[i] = i + 1;
		}

		for (int i = 0; i < arrayFirst.length; i++) {
			if (arrayFirst[i] % 2 == 1) {
				System.out.println(arrayFirst[i]);
			}

		}
//      2. 10~1까지 중 짝수만 배열에 담고 출력

		int[] arraySecond = new int[10];

		for (int i = 0; i < 10; i++) {
			arraySecond[i] = 11 - i;
		}

		for (int i = 0; i < 10; i++) {
			if (arraySecond[i] % 2 == 0) {
				System.out.println(arraySecond[i]);
			}
		}
//      3. 1~77까지 중 짝수만 배열에 담고 출력

		int[] arrayThird = new int[77];

		for (int i = 0; i < 77; i++) {
			arrayThird[i] = i + 1;
		}

		for (int i = 0; i < 77; i++) {
			if (arrayThird[i] % 2 == 0) {
				System.out.println(arrayThird[i]);
			}
		}

//      실버
//      1.A~F까지 배열에 담고 출력

		char[] arrayFourth = new char['F'];

		for (char i = 64; i < 70; i++) {
			arrayFourth[i] = (char) (i + 1);
			System.out.println(arrayFourth[i]);
		}
		
//      2. 5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력

		Scanner sc = new Scanner(System.in);
		int[] arrayFifth = new int[5];
		System.out.println("일단 정수를 하나 입력해");
		arrayFifth[0] = sc.nextInt();

		int maxInt = arrayFifth[0];
		int minInt = arrayFifth[0];
		System.out.println("정수 입력 4번 실시한다 아쎄이");
		for (int i = 1; i < 5; i++) {
			arrayFifth[i] = sc.nextInt();

			// 최댓값 로직

			if (arrayFifth[i] > maxInt) {
				maxInt = arrayFifth[i];
			}

			// 최솟값 로직
			if (arrayFifth[i] < minInt) {
				minInt = arrayFifth[i];
			}
		}
		System.out.println("최대 값은" + maxInt);
		System.out.println("최소 값은" + minInt);
	
//      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
//      String message = "번 째 정수를 입력하세요.\n";
//      Scanner sc = new Scanner(System.in);
//      int[] arData4 = new int[5];
//      int count = 0, min = 0, max = 0;
//      
//      while(true) {
//         System.out.print(count + 1 + message);
//         arData4[count] = sc.nextInt();
//         count++;
//         if(count > 4) {
//            break;
//         }
//      }
//      
//      min = arData4[0];
//      max = arData4[0];
//      
//      for(int i = 1; i < arData4.length; i++) {
//         if(min > arData4[i]) { min = arData4[i]; }
//         if(max < arData4[i]) { max = arData4[i]; }
//      }
//      
//      System.out.println("최댓값: " + max);
//      System.out.println("최솟값: " + min);
      
//   }
//}

	
	
	}
	
	

}

