package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamTask3 {
	public static void main(String[] args) {
		User user1 = new User(1L, "홍길동", 20, "개발자", "남"); 
		User user2 = new User(2L, "장보고", 30, "기획자", "남"); 
		User user3 = new User(3L, "이순신", 35, "사장", "남"); 
		User user4 = new User(4L, "김영희", 25, "간호사", "여"); 
		User user5 = new User(5L, "김철수", 35, "소방관", "남"); 
		User user6 = new User(6L, "김영숙", 22, "유튜버", "여"); 
		
//		유저의 이름만 모두 붙여서 출력
//		"홍길동, 장보고, 이순신, 김영희, 김철수, 김영숙"
//		System.out.println(user1.getName() + ", " + user2.getName() + ", " + user3.getName() + ", " + user4.getName() + ", "+ user5.getName() + ", "+ user6.getName());
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5, user6));
		
//		String userNames = users
//			.stream()
//			.map(User::getName)
//			.collect(Collectors.joining(", "));
//		
//		System.out.println(userNames);
		
//		유저의 성별이 "남"이라면 "man",
//		"여"라면 "woman"으로 바꿔서 모두 출력하기
		
		
		
	}
}










