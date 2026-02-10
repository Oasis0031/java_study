package castingTask;

// 심화
public class CastingTask04 {
	public static void main(String[] args) {
//       (심화)      
//       "0.12346", "0.5130", "78", "9.133";
//      4개 값을 더해서 123456789를 출력하기

		String data1 = "0.12346";
		String data2 = "0.5130";

		//1234를 추출하려면 data1에 1000을 곱하고 뒤를 잘라버리자.
		double parsedData1 = Double.parseDouble(data1);
		int makeOneTwoThreeFour = (int) (parsedData1 * 10000);
		
		//5를 추출하려면 data2에서 10을 곱하고 뒤를 잘라버리자 
		double parsedData2 = Double.parseDouble(data2);
		int makeFive = (int)(parsedData2 * 10);
		String OneTwoThreeFour = String.valueOf(makeOneTwoThreeFour);
		String five = String.valueOf(makeFive);

		// 6을 추출하려면 100000을 곱하고 12340을 빼보자
		double parsedData1MakingSix = Double.parseDouble(data1);
		double makeSix = (parsedData1MakingSix * 100000) - 12340;
		int intSix = (int) makeSix;
		String six = String.valueOf(intSix);

		// 연결할 수 있는 것 부터 연결하고 뒷자리를 잘라버리자.
		// 더블로 바꾸고, 인트로 변경
		// 7,8,9를 추출하려면 둘을 이은 후에, 더블로 바꾸고, 인트로 형변환해서 뒤를 자르자.
		String data3 = "78";
		String data4 = "9.133";
		
		String newData2 = data3 + data4;
		double parsedData3 = Double.parseDouble(newData2);
		int sen = (int) parsedData3;
		String sevenEightNine = String.valueOf(sen);

		String result = "%s%s%s%s";
		System.out.printf(result, OneTwoThreeFour, five, six, sevenEightNine);
	}
}
