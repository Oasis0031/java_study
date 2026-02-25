package lambdaTask1;

public class LamdaTask1 {
	public static void main(String[] args) {
//      1~10까지 출력해주는 메서드
//      문자열, 문자형, 인덱스를 전달하면 해당 인덱스에 값을 전달한 문자형으로 바꿔주는 메서드 

		NumPrinter numPrinter = (num) -> {
			for (int i = 0; i < 10; i++) {
				num = i + 1;
				System.out.println(num);
			}
			return num;
		};

		StringChanger Changer = (text, c, index) -> {
			String result = "";
			char[] chars = text.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				if (index == i) {
					result += c;
				} else {
					result += chars[i];
				}
			}
			return result;
		};

		numPrinter.numPrinter(1);

	}
}
