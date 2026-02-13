package methodTest;

public class MethodTest {

	void printName(String name) {
		System.out.println(name);
	};

	// 두 수를 더해서 결과를 반환하는 메서드
	double add(double num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		mt.printName("성이름");
		
		
	}
}
