package ifTask;

import java.util.Scanner;

public class ifTask {
	public static void main(String[] args) {
//      거스름돈 계산하기
//      1번 상품: 코카콜라 - 2000원
//      2번 상품: 펩시 - 1500원
//      3번 상품: 맥콜 - 1000원

//      가진돈은 10000
//      사용자가 하나의 상품을 선택하고 구매개수를 입력해서
//      거스름돈을 계산하는 로직을 완성하시오
//      출력 예시)
//      구매상품: 콜라 2개
//      판매가격: 4000원
//      거스름돈: 6000원


		String howManyMessage = "몇 개나 사시겠습니까? 숫자로만 입력하세요.", whichOneMessage = "뭘 사시겠습니까? (코카콜라, 펩시, 맥콜)";
		int ea = 0, coca = 2000, pepsi = 1500, macol = 1000, money = 10000, change = 0, price = 0, total;
		System.out.println(whichOneMessage);
		Scanner sc = new Scanner(System.in);

		String drink = sc.nextLine();
		if (drink.equals("코카콜라")) {
			price += coca;
		} else if (drink.equals("펩시")) {
			price += pepsi;
		} else if (drink.equals("맥콜")) {
			price += macol;
		}
		System.out.println(drink + "는(은) " + price + "원 입니다.");
		System.out.println(howManyMessage);
		ea = sc.nextInt();
		System.out.println( drink +"를(을) "+ ea + "개 구매하셨습니다.");
		total = price * ea;
		System.out.println("총액:" + total);
		System.out.println("계산을 실행합니다.");
		if (total > money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			change = money - total;
			System.out.println("거스름돈 " + change + "원 입니다.");
		}
		sc.close();
	}
}
//
//package isTask;
//
//import java.util.Scanner;
//
//public class ifTask {
//   public static void main(String[] args) {
////      거스름돈 계산하기
////      1번 상품: 코카콜라 - 2000원
////      2번 상품: 팹시 - 1500원
////      3번 상품: 맥콜 - 1000원
//
////      가진돈은 10000
////      사용자가 하나의 상품을 선택하고 구매개수를 입력해서
////      거스름돈을 계산하는 로직을 완성하시오
////      출력 예시)
////      구매상품: 콜라 2개
////      판매가격: 4000원
////      거스름돈: 6000원
//      Scanner sc = new Scanner(System.in);
//      int cocaColaPrice = 2000, pepsiPrice = 1500, mcColPrice = 1000, money = 10000,
//            choice = 0, stock = 0, totalPrice = 0;
//      
//      String coca = "코카콜라", pepsi = "팹시", mcCol = "맥콜", choiceDrink = "",
//            exampleMessage1 = "상품을 고르세요.\n1. 코카콜라\n2. 팹시\n3. 맥콜",
//            exampleMessage2 = "구매 수량을 입력하세요.\nex)10",
//            result = "구매상품: %s %d개\n"
//                  + "판매가격: %d원\n"
//                  + "거스름돈: %d원";
//      
//      System.out.println(exampleMessage1);
//      choice = sc.nextInt();
//      
//      System.out.println(exampleMessage2);
//      stock = sc.nextInt();
//      
//      if(choice == 1) {
//         choiceDrink = coca;
//         totalPrice = cocaColaPrice * stock;
//      }else if(choice == 2) {
//         choiceDrink = pepsi;
//         totalPrice = pepsiPrice * stock;
//      }else if(choice == 3) {
//         choiceDrink = mcCol;
//         totalPrice = mcColPrice * stock;
//      }else {
//         System.out.println("잘못 입력하셨습니다.");
//      }
//      
//      money -= totalPrice;
//      
//      System.out.printf(result, choiceDrink, stock, totalPrice, money);
//   }
//}
