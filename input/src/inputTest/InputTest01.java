package inputTest;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요. \nex홍 길동", name = null, firstName = null, lastName = null;
		System.out.println(message);
		lastName = sc.nextLine();
		firstName = sc.nextLine();
		name = firstName + lastName;
		System.out.println(name + "Hello there");

		sc.close();
	}
}
