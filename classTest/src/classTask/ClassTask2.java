package classTask;

import java.util.Scanner;

// 슈퍼카(SuperCar) 클래스 생성
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔 

class SuperCar {
	String brand;
	String color;
	int price; 
	boolean engine;
	String password;
	static int wrongPasswordCounter;
	String passwordChecker;
	
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, boolean engine, String password, int wrongPasswordCounter) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = engine;
		this.password = password;
	}
	
	// 스태틱 블럭
	static {
		System.out.println("Aushubitch Online");
	}
	
	//초기화 블럭
	{
		wrongPasswordCounter = 0;
	}
	
	void passwordChecker() {
		System.out.println("암호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		while(true) {
		passwordChecker = sc.next();
		
		//패스워드 체커와 패스워드가 틀리면 카운터 1 증가
		if(!passwordChecker.equals(password)) {
			wrongPasswordCounter++;
			System.out.println("현재 틀린 횟수" + wrongPasswordCounter);
		} else {
		//맞으면 엔진 시동
			engine = true;
			System.out.println("엔진 점화, 부릉부릉");
			break;
		}
		//패스워드가 3번 틀리면
		if(wrongPasswordCounter >= 3) {
			System.out.println("Call embulance! But not for me!");
		}
	}
	}
}
    

public class ClassTask2 {
   
   public static void main(String[] args) {
//   1. 슈퍼차 객체화
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//   3. 비밀번호 3회 오류시 경찰 출동
	   
		SuperCar kia = new SuperCar("하겐다겐", "레드", 3000, false, "a1234", 0);
		kia.passwordChecker();
		System.out.println("현재 엔진 상태 " +  kia.engine);
	}

}
