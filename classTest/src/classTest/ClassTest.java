package classTest;

class Animal {

	 String name;
	 int age;
	 String species;
	 
//   기본 생성자
	 public Animal() {
	}

//	초기화 생성자	this 없이는 초기화가 되지 않는다!
	 public Animal(String name, int age, String species) {
		 this.name = name;
		 this.age = age;
		 this.species = species;
	 }
}

public class ClassTest {
	// 동물(Animal)
	public static void main(String[] args) {
		//메모리에 할당 -> new
		Animal rabbit = new Animal("자오", 20, "토끼");
		Animal cat = new Animal("코미", 3, "고양이");
		
		
		System.out.println(rabbit.name);
		System.out.println(cat.name);
//		만들고 나서 값 집어넣으면 안 됨!!
//		rabbit.name = "토깽이";
//		rabbit.age = 20;
//		rabbit.species = "토끼";
	}
}
