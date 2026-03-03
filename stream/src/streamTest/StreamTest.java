package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

// JDK 8 API
// map
// filter
// forEach
public class StreamTest {
	public static void main(String[] args) {
//		IntStream: 숫자를 이용한 Stream 문법을 사용할 수 있게 제공해주는 인터페이스(객체)
//		.range(): 반복할 수 있는 횟수(범위)를 만들어주는 메서드
//		IntStream.range(0, 10).forEach((num) -> { System.out.println(num); });
		
//		ArrayList에 1~10까지 값을 추가
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach((num) -> { numbers.add(num); });
//		
//		numbers.forEach((num) -> {System.out.println(num);});
		
//		.forEach()
//		1. numbers2를 ArrayList 생성
//		2. 1~50까지 짝수만 numbers2에 추가하고 모두 출력하기
//		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 50).forEach((num) -> {
//			if(num % 2 == 0) {
//				numbers2.add(num);
//			}
//		});
		
//		참조형
//		.(객체명::메서드명)
//		numbers2.forEach(System.out::println);
		
//		ArrayList numbers3를 생성하고
//		참조형으로 numbers3에 1~10까지 값을 추가하기
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(numbers3::add);
//		System.out.println(numbers3);
		
//		문자열 stream
//		.chars()
//		String data = "ABCDEF";
		
//		1. 참조를 하면 안되는 순간
//		문자형 출력이 불가능 -> 목적에 맞지 않음
//		data.chars().forEach((c) -> {System.out.println((char)c);});
		
//		2. 0삭제 -> 1번째 인덱스가 0번째 인덱스를 갖게된다.
//		즉 삭제를 할 때 값을 건너뛰게 되어 참조형 사용이 불가능하다.
//		ArrayList<Integer> numbers4 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(numbers4::add);
//		System.out.println(numbers4);
//		IntStream.range(0, 5).forEach(numbers4::remove);
//		System.out.println(numbers4);
		
//		.map(): 기존 값을 다른 값으로 변경할 때 사용하는 메서드
//		※ return이 반드시 필요하다.
//		1~10 까지 추가
//		ArrayList<Integer> numbers5 = new ArrayList<Integer>(); 
//		IntStream.range(0, 10).map((n) -> n + 1).map(n -> n * 10).forEach(System.out::println);
		
		String data = "ABCDEFG";
//		data를 "abcdefg"로 변경하여 출력
		data.chars().map((c) -> c + 32).forEach((c) -> System.out.print((char)c));
		
		
	}
}















