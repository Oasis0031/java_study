package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
	Calc calc = (num1, num2) -> num1 + num2;	
	Calc2 calc2 = (num1, num2) -> num1 / (double)num2;
	
	System.out.println(calc2.devide(10, 3));
	}
}
