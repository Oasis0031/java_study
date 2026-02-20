package inheritanceTask;

//   상속 및 분리 실습
//   
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다

class PersonTask {
	String name;
	int age;
	String address;
	String phone;

	public PersonTask() {
		;
	}

	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	void work() {
		System.out.println("일을 한다");
	}

	void sleep() {
		System.out.println("잠을 잔다");
	}

	void eat() {
		System.out.println("세 끼를 먹는다.");
	}

}

//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다

class StudentTask extends PersonTask {
	String instaId;

	public StudentTask() {
		;
	}

	public StudentTask(String name, int age, String address, String phone ,String instaId) {
		super(name, age, address, phone);
		this.instaId = instaId;
	}

	@Override
	void work() {
		System.out.println("알바를 뛴다.");
	}

	@Override
	void sleep() {
		System.out.println("수업시간에 잔다.");
	}

	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
}

//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다

class EmployeeTask extends PersonTask {
	int nestEgg;

	public EmployeeTask() {
		;
	}

	public EmployeeTask(String name, int age, String address, String phone,int nestEgg) {
		super(name, age, address, phone);
		this.nestEgg = nestEgg;
	}

	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}

	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}

	@Override
	void work() {
		System.out.println("하루 종일 일을 한다");
	}
}
//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask {
	public static void main(String[] args) {

		PersonTask human = new PersonTask("잉여인간", 32, "경기도 시흥시", "01045104714");
		StudentTask gakusei = new StudentTask("정시파이터", 22, "경기도 안산시", "01023456789", "@FiveWater");
		EmployeeTask slave = new EmployeeTask("농노", 32, "경기도 수원시", "01034567891",3000000);

		human.eat();
		human.sleep();
		human.work();

		gakusei.eat();
		gakusei.sleep();
		gakusei.work();

		slave.eat();
		slave.sleep();
		slave.work();
	}
}
