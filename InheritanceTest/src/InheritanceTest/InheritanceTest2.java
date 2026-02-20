package InheritanceTest;

class Animal2 {
	String name;
	
	void eat(){
		System.out.println("먹기");
	}
	void sleep(){
		System.out.println("자기");
	}
	void poop(){
		System.out.println("배변");
	}
	void walk() {
		System.out.println("걷기");
	}
}

class Person extends Animal2 {}
class Monkey extends Animal2 {}
class Cat extends Animal2 {}
class Snake extends Animal2 {
	@Override
	void walk() {
		System.out.println("기기");
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		Person person = new Person();
		Monkey monkey = new Monkey();
		Cat cat = new Cat();
		Snake snake = new Snake();
		
		person.eat();
		person.sleep();
		person.poop();
		person.walk();
		
		monkey.eat();
		monkey.sleep();
		monkey.poop();
		monkey.walk();
		
		cat.eat();
		cat.walk();
		
		snake.eat();
		snake.sleep();
		snake.poop();
		
		//뱀은 걸을 수 없기에 오버라이드
		snake.walk();
	}
}


