package streamTask;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
	
	public static int add97(int num) {
		return num + 97;
	}
	
	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	
	public static char valueOf(int num) {
		return (char)num;
	}
	
	public static void main(String[] args) {
//		a...z까지 ArrayList에 담고
//		"acegi..." 문자열로 출력
//		String result = IntStream
//			.rangeClosed(0, 25)
//			.map(n -> n + 97)
//			.filter(n -> n % 2 != 0)
//			.mapToObj(n -> (char)n)
//			.map(String::valueOf)
//			.collect(Collectors.joining(""));
//		
//		System.out.println(result);
		
		String result = IntStream
				.rangeClosed(0, 25)
				.map(StreamTask2::add97)
				.filter(StreamTask2::isOdd)
				.mapToObj(StreamTask2::valueOf)
				.map(String::valueOf)
				.collect(Collectors.joining(""));
			
		System.out.println(result);
		
	}
}







