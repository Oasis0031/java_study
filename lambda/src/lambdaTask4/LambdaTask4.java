package lambdaTask4;

public class LambdaTask4 {
	public static void main(String[] args) {
//      1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//      입력 예시)
//      3
//      출력 예시)
//      3 x 1 = 3
//      ...
//      3 x 9 = 27 
		Multipication multipication = (num) -> {

			for (int i = num; i <= 9; i++) {
				System.out.println(num + " x " + i + " = " + (num*i));
			}
			return num;
		};
		
		multipication.multi(3);

//      2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
//      입력 예시1)
//      10, 20, "+"
//      
//      출력 예시1)
//      30

//      입력 예시2)
//      10, 20, "-"
//      
//      출력 예시2)
//      -10
		
		Calculator cal = (num1, num2, mark) -> {
			int plusResult = 0;
			int minusResult = 0;
			int result = 0;
			
			if (mark == "+") {
				plusResult = num1 + num2;
				
			} else if(mark == "-") {
				minusResult = num1 - num2;
			}
			result = plusResult + minusResult;
			return result;
		};
		
		System.out.println(cal.calculator(5, 3, "-"));
		
		

//      3. 배열에 10개의 무작위 정수를 전달하면,
//      큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
//      입력 예시)
//      {10, 3, 7, 8, 0, 9}

//      출력 예시)
//      {10, 9, 8, 7, 3, 0}
		
		Descending descending = (nums) -> {
			
				for (int i = 0; i < nums.length; i++) {
					for (int j = 0; j < nums.length; j++) {
						if (nums[i] < nums[j]) {
							int temp = nums[i];
							nums[i] = nums[j];
							nums[j] = nums[i];
						}
					}
				}
		};
		

	}
}
