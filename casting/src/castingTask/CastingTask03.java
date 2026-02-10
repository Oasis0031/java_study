package castingTask;

public class CastingTask03 {
	public static void main(String[] args) {
//      'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기

		// 1. 아스키코드 소문자와 대문자 사이의 규칙 찾기
		// 2. 소문자가 대문자보다 32가 크다는걸 알았으니, 대문자로 바꾸기 위해 소문자에서 32를 빼기
		// 3. 이걸 char 형으로 선언
		// 4. 출력
		// 5. Profit!

		char aConverter = 'a' - 32, jConverter = 'j' - 32, kConverter = 'k' - 32;
		String result = "%c %c %c";
		System.out.printf(result, aConverter, jConverter, kConverter);

	}
}
