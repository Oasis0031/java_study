package classTask;

// 스포츠 추상화
// 농구, 야구, 축구
// 객체화 -> 기본 생성자, 초기화 생성자

class Sports {
	String ball;
	int members;
	String name;

	public Sports() {};
	//shift alt s -> o 초기화 생성자 단축키
	public Sports(String ball, int members, String name) {
		this.ball = ball;
		this.members = members;
		this.name = name;
	}
}

public class ClassTask {
	public static void main(String[] args) {
		
		Sports basketball = new Sports("농구공",5,"농구");
		Sports baseball = new Sports("야구공", 9, "야구");
		Sports soccer = new Sports("축구공", 12, "축구");

		System.out.println(basketball.ball);
		System.out.println(baseball.members);
		System.out.println(soccer.name);
	}
}
