package castingTask;

public class CastingTask02 {
	public static void main(String[] args) {
//		"8.43" + 2.59를 더해서 10이 나오도록 출력하기
		
		String num1 = "";
		double num2 = 0;
		
		num1 = "8.43";
		num2 = 2.59;
		
		int stringResult = (int)Double.parseDouble(num1); 
		int doubleResult = (int)num2;
		
		int sumResult =  stringResult + doubleResult;
		
		System.out.println(sumResult); 
		
	}
}
