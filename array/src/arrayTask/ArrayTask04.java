package arrayTask;

import java.util.Scanner;

public class ArrayTask04 {
	public static void main(String[] args) {
//      다이아
//      1. 계산기 만들기
//      사용자의 수식의 결과 값을 출력하는 계산기를 만드세요.
//      입력 예시1)
//      10 + 7 + 9
//      출력 예시1)
//      26

//      입력 예시2)
//      -7 + 8 + 11
//      출력 예시2)
//      12

//      힌트) 문자열의 메서드 .split()은 구분점으로 잘라 배열로 리턴하는 메서드이다.
//      자바에서는 구분점을 여러 개 전달할 수 있으며 여러개를 전달할 때에는 | 연산자를 이용한다
//      예를 들어 +, -를 구분점으로 자른다면 .split(\\+|\\-)로 전달해야한다.
//      \\는 제어문자가 아닌 문자열로 인식하기 위함이다.
		Scanner sc = new Scanner(System.in);
		String message = "수식을 입력하세요.\n10+10+2", expression = null;
		String[] values = null;
		String[] opers = null;
		int operCount = 0, result = 0, index = 0;

//      .trim(): 양쪽 공백 제거
//      System.out.println(" 77ㅓ억 ".trim());

		System.out.println(message);
		expression = sc.nextLine();
		values = expression.split("\\+|\\-");

		opers = new String[values.length - 1];

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '+' || c == '-') {
				opers[operCount] = String.valueOf(c);
				operCount++;
				continue;
			}
		}

//      첫 번째가 음수인지 아닌지
//      1. values[0] 공백이라면 음수
		if (values[0].equals("")) {
			result = Integer.parseInt(opers[0] + values[1]);
			index = 2;
		} else {
			result = Integer.parseInt(values[0]);
			index = 1;
		}

//      2. 계산
		for (int i = values[0].equals("") ? 1 : 0; i < opers.length; i++) {
			result += Integer.parseInt(opers[i] + values[index]);
			index++;
		}

		System.out.println(result);
	}
	
	
}
 