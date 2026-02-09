package formatTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "김세종";
		int age = 26;
		double height = 171.1;
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("나이: %.2f\n", height);
	}
}
