package classTest;

//부모
class Car {
	public Car() {
		;
	}

	void engineStart() {
		System.out.println("열쇠로 시동을 켬");
	}

}

//자식
class SuperCar extends Car {
	public SuperCar() {;}

	//부모의 코드
	@Override
	void engineStart() {
		System.out.println("음성으로 시동을 켬");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
}

public class ClassTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		//UpCasting
		Car noOptionFerrari = new SuperCar();
		
		noOptionFerrari.engineStart();

		//upCasting 객체와 부모의 객체는 다르다.
		// 오버라이딩 된 메서드의 결과가 다르다.
		matiz.engineStart();
		noOptionFerrari.engineStart();
		
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		fullOptionFerrari.engineStart();
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
	}
}
