package InheritanceTest;

class Animal {
//	1. private 붙이자!
	private String name;
	private int age;
	private String species;
	private int numbersOfLeg;
	private String gender;
	
	public Animal() {
	}

	public Animal(String name, int age, String species, int numbersOfLeg, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
		this.numbersOfLeg = numbersOfLeg;
		this.gender = gender;
	}

	
	// Alt + Shift + S -> R
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//public String getName(){
	//		return name;
	//}
	
	//public void setName(String name){
	//	this.name = name;
	//}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getNumbersOfLeg() {
		return numbersOfLeg;
	}

	public void setNumbersOfLeg(int numbersOfLeg) {
		this.numbersOfLeg = numbersOfLeg;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}   

public class InheritanceTest4 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setName("이규학");
		System.out.println(animal.getAge());
	}
}
