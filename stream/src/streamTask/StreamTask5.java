package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask5 {

	public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}

		Integer[] arr = { 10, 20, 30, 40, 50, 60 };
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(arr));

		int result = 0;
		result = nums.stream().mapToInt(n -> n).sum();
		System.out.println(result);

//      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 이름과 취미를
//      아래와 같이 출력한다
//      이름: 홍길동
//      취미: 스포츠댄스, 개발
//
//      필드 : 이름, 취미, 소개
//      홍길동, 축구_농구_야구, 나는 축구왕!
//      이순신, 개발_당구_축구, 나는 개발자 좋아!
//      장보고, 피아노, 피아노만 한 우물!
//      김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//      김영희, 골프_야구, 운동 선수는 나의 꿈
//      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!

		Member mem1 = new Member(1L, "홍길동", "축구_농구_야구", "나는 축구왕!");
		Member mem2 = new Member(2L, "이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member mem3 = new Member(3L, "장보고", "피아노", "피아노만 한 우물!");
		Member mem4 = new Member(4L, "김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member mem5 = new Member(5L, "김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member mem6 = new Member(6L, "흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
//

		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(mem1, mem2, mem3, mem4, mem5, mem6));

		Member[] memberArr = new Member[] { mem1, mem2, mem3, mem4, mem5, mem6 };
		ArrayList<Member> memberz = new ArrayList<Member>();
		memberz.addAll(Arrays.asList(memberArr));

		memberz.stream().filter(member -> member.getHobby().contains("개발"))
				.map(member -> "이름 : " + member.getName() + "\n취미 : " + member.getHobby().replaceAll("_", " "))
				.forEach(System.out::println);

//      3) 취미를 3개 이상 가진 사람의 id를 출력
		List<Long> memberz2 =
				memberz.stream().filter(member -> member.getHobby().split("_").length >= 3)
				.map(member -> member.getId()).collect(Collectors.toList());

		memberz2.forEach(id -> {System.out.println(id);});
		
//      4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds에 담기

		ArrayList<Long> hobbyIds = (ArrayList<Long>) members.stream().filter(m -> m.getHobby().matches(".*_.*_.*"))
				.map(Member::getId).collect(Collectors.toList());

//      List<Long> hobbyIds = members
//      .stream()
//      .filter(member -> member.getHobbies().split("_").length >= 3)
//      .map(member -> member.getId())
//      .collect(Collectors.toList());

//ArrayList<Long> hobbyIds = members
//      .stream()
//      .filter(member -> member.getHobbies().split("_").length >= 3)
//      .map(member -> member.getId())
//      .collect(Collectors.toCollection(ArrayList::new));
////      .collect(Collectors.toCollection(() -> new ArrayList<Long>()));
//
//hobbyIds.forEach(id -> {System.out.println(id);});
//
//
//
//HashMap<Long, Long> Longs = members
//   .stream()
//   .filter(member -> member.getHobbies().split("_").length >= 3)
//   .map(member -> member.getId())
//   .collect(Collectors.toMap(
//         id -> id, 
//         id -> id,
//         (a, b) -> a,
//         () -> new HashMap<Long, Long>()));


		
		
//      5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개 출력하기

//	   members.stream()
//	   .filter(m -> hobbyIds.contains(m.getId()))
//	   .forEach(m -> {
//	   System.out.println( m.getIntro());
//	   }
//	   );
//	   
//		members의 데이터 소개 출력하기
//	      System.out.println(hobbyIds.contains(1L));
//	      members
//	         .stream()
//	         .filter(member -> hobbyIds.contains(member.getId()))
//	         .map(member -> member.getIntroduce())
//	         .forEach(System.out::println);

//      6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//      출력 예시)
//         이름: 흰둥이
//         취미: 개발_축구_농구
//         소개: 개발도 운동도 다 잘해요!

		Member LongestIntro = members.stream()
				.max(Comparator.comparingInt(m -> m.getIntro().length())).orElse(null);

		if (LongestIntro != null) {
			System.out.println("--- 소개를 가장 길게 쓴 사용자 ---");
			System.out.println("이름: " + LongestIntro.getName());
			System.out.println("취미: " + LongestIntro.getHobby());
			System.out.println("소개: " + LongestIntro.getIntro());
		}
		
//	      Optional<Member> member = members
//	    	         .stream()
//	    	         .max(Comparator.comparingInt(m -> m.getIntroduce().length()));
//	    	      
//	    	      System.out.println(member);
//	    	      

	}
}
