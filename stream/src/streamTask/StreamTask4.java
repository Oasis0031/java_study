//package streamTask;
//
//import java.util.ArrayList;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class StreamTask4 {
//	public static void main(String[] args) {
////      모두 Stream 문법으로 활용
////      1. 1~10까지 ArrayList에 담고 총 합을 출력
//
//		// 넘버즈 어레이리스트 생성
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		// 범위를 1~10으로 하여 numbers ArrayList에 담기
//		IntStream.rangeClosed(1, 10).forEach(numbers::add);
//		// 총합을 만드는데, 넘버즈의 스트림을 이용
//		int totalSum = numbers.stream()
//				// mapToInt를 사용하여 IntStream으로 형변환
//				.mapToInt(Integer::intValue)
//				// 값을 모두 더한다.
//				.sum();
//		System.out.println(totalSum);
//
////		2. ABCDEF를 각각 문자 별로 출력
//
//		String data = "ABCDEF";
//
//		String str = data.chars().map((c) -> c).mapToObj((c) -> (char) c).map(String::valueOf)
//				.collect(Collectors.joining(","));
//		System.out.println(str);
//
////      3. ABDEF를 문자열로 출력
//		String str2 = data.chars().filter(c -> c != 'C').mapToObj((c) -> (char) c).map(String::valueOf)
//				.collect(Collectors.joining(""));
//		System.out.println(str2);
//
////      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
//
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).forEach(nums::add);
//
//		// 홀수를 담는 어레이리스트 생성
//		ArrayList<Integer> odds = nums.stream()
//				// 필터로 짝수 걸러내기
//				.filter(num -> num % 2 != 0)
//				// toCollection으로 어레이리스트 지정, 생성자를 만들어서 그 안에 담기
//				.collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(odds);
//
////      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
////      Black, WHITE, reD, yeLLow, PINk
//
//		ArrayList<String> colors = new ArrayList<String>();
//		colors.add("Black");
//		colors.add("WHITE");
//		colors.add("reD");
//		colors.add("yeLLow");
//		colors.add("PINk");
//
//		long countA = colors.stream().map(String::toLowerCase).flatMapToInt(String::chars).filter(col -> col == 'a')
//				.count();
//		System.out.println(countA);
//
////      6. 첫 번째 문자가 대문자인 문자열만 출력
////      Apple, banana, Melon, tomato
//
//		ArrayList<String> fruits = new ArrayList<String>();
//		fruits.add("Apple");
//		fruits.add("banana");
//		fruits.add("Melon");
//		fruits.add("tomato");
//
//		fruits.stream().filter(c -> Character.isUpperCase(c.charAt(0))).forEach(System.out::println);
//// 		7. 한글을 정수로 변경
////      "공일이삼" -> "0123"
//
////		인덱스를 비교해서 입력된 값이랑 kor의 인덱스를 교체하면 한글을 정수로 바꿀 수 있지 안ㅇ=ㅎ을까
//
//		String kor = "공일이삼사오육칠팔구";
//		String input = "공일이삼";
//
//		String result = input.chars().mapToObj(c -> String.valueOf(kor.indexOf(c))).collect(Collectors.joining(""));
//
//		System.out.println(result);
//
////      8. 정수를 한글로 변경
////      "0123" -> "공일이삼"
//
//		String target = "0123";
//		String result2 = target.chars()
//			    .mapToObj(c -> String.valueOf(kor.charAt(c - '0')))
//			    .collect(Collectors.joining(""));
//		System.out.println(result2);
//
//	}
//}

package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StreamTask4 {

	public static String changeToZero(int n) {
		return String.valueOf((char) (n + 65));
	}

	public static void main(String[] args) {
//      모두 Stream 문법으로 활용
//      1. 1~10까지 ArrayList에 담고 총 합을 출력
//      IntStream
//         .rangeClosed(1, 10)
//         .mapToObj(Integer::valueOf)
//         .collect(Collectors.toList())
//         .forEach(System.out::println);

//      2. ABCDEF를 각각 문자 별로 출력
//      String data2 = IntStream
//         .range(0, 6)
//         .mapToObj(StreamTask4::changeToZero)
//         .collect(Collectors.joining(""));
//      System.out.println(data2);

//      3. ABDEF를 문자열로 출력
//      String data3 = IntStream
//         .range(0, 5)
//         .map(n -> n > 1 ? n + 1 : n)
//         .mapToObj(StreamTask4::changeToZero)
//         .collect(Collectors.joining(""));
//      
//      System.out.println(data3);

//      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
//      IntStream
//         .rangeClosed(1, 50)
//         .mapToObj(n -> n * 2 - 1)
//         .collect(Collectors.toList())
//         .forEach(System.out::println);
//      
//      Integer[] arr = new Integer[50];
//      for(int i = 0; i < arr.length; i++) {
//         arr[i] = (i + 1) * 2 - 1;
//      }
//      
//      ArrayList<Integer> datas3 = new ArrayList<Integer>(Arrays.asList(arr));
//      
//      datas3.addAll(Arrays.asList(arr));
//      System.out.println(datas3);

//      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
//      Black, WHITE, reD, yeLLow, PINk, apple
//      ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Blasack", "WHITE", "reD", "yeLLow", "PINk", "apple"));
//      int aCount = datas5
//         .stream()
//         .map(String::toLowerCase)
//         .filter(lowercase -> lowercase.contains("a"))
//         .map(str -> str.chars()
//               .filter(c -> c == 97)
//               .mapToObj(c -> String.valueOf((char)c))
//               .collect(Collectors.joining(""))
//         )
//         .collect(Collectors.joining("")).length();
//      
//      System.out.println(aCount);
//      
//      int aCount2 = datas5
//         .stream()
//         .map(String::toLowerCase)
//         .filter(lowercase -> lowercase.contains("a"))
//         .map(str -> str.chars()
//               .filter(c -> c == 97)
//               .mapToObj(c -> String.valueOf((char)c))
//               .collect(Collectors.joining(""))
//               .length()
//         )
//         .mapToInt(n -> n)
//         .sum();
//      
//      System.out.println(aCount2);
//      System.out.println(datas5);

//      6. 첫 번째 문자가 대문자인 문자열만 출력
//      "Apple", "banana", "Melon", "tomato"
//      ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
//      datas6
//         .stream()
//         .filter((str) -> str.charAt(0) >= 'A')
//         .filter((str) -> str.charAt(0) <= 'Z')
//         .forEach(System.out::println);

//      7. 한글을 정수로 변경
//      "공일이삼" -> "0123"
//      String hangle = "공일이삼사오육칠팔구", message = "한글을 입력하세요.\nex)공일이삼", input = null;
//      Scanner sc = new Scanner(System.in);
//      System.out.println(message);
//      input = sc.next();
//      input.chars().map(hangle::indexOf).forEach(System.out::print);

//      8. 정수를 한글로 변경
//      "0123" -> "공일이삼"
		String hangle = "공일이삼사오육칠팔구", message = "정수를 입력하세요.\n0123", input = null;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		input = sc.next();

		input.chars().map(c -> c - 48).map(hangle::charAt).mapToObj(c -> String.valueOf((char) c))
				.forEach(System.out::print);

	}
}
