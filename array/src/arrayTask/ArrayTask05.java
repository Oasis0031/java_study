package arrayTask;

import java.util.Scanner;

public class ArrayTask05 {
	public static void main(String[] args) {
//      골드 ~ 플레티넘
//      1. 비밀번호를 암호화해주는 로직을 완성하세요.
		// 입력예시)
//      test123!@#

//      비밀번호 이외의 특수문자가 나올 수 있음.
//      출력 예시)
//      ???????

		Scanner sc = new Scanner(System.in);

		System.out.println("비밀번호를 입력하세요. 비밀번호는 암호화 됩니다.");

		String password = sc.next(), aikotoba = null;

		for (int i = 0; i < password.length(); i++) {
			aikotoba = password.replaceAll(password, "????????");
		}
		System.out.println("암호화된 패스워드는" + aikotoba + "입니다.");

//      2. 가장 많이 판매된 상품의 총 판매 수익과
//      가장 적게 판매되 상품의 판매 수익의 차를 출력하세요.
//      아메리카노 2000원, 카페라떼 3000원, 에이드 4000원, 밀크쉐이크 5000원
		String[] menus = { "아메리카노", "카페라떼", "에이드", "밀크쉐이크" };
		int[] menusPrice = { 2000, 3000, 4000, 5000 };
		int sum = 0;
//      orders의 정수는 menus의 주문 번호입니다.
		int[] orders = { 0, 1, 0, 1, 3, 1, 1, 2, 2, 0, 2, 3, 1, 2, 3, 0, 2, 2, 1, 1, 0 };

		System.out.println("각 음료의 판매수익 계산하기");

		for(int i =0; i < orders[i]; i++) {
			while(true) {
				
			}
		}
	
	}
}
