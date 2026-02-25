package InterfaceTest2;

//	동물(Animal)
//	육식동물(Carnivore), 초식동물(herbivore)
//	Lion, Bear, Deer, Rabbit

public class InterfaceTest2 {

	// 초식동물이면 채소
	// 육식동물이면 고기

	public void checkAnimal(Animal animal) {

		if (animal instanceof HerbivoreMarker) {
			this.feedharbiivore((HerbivoreMarker) animal);
		} else if (animal instanceof CarnivoreMarker) {
			this.feedCarnivore((CarnivoreMarker) animal);
		}
	}

	// 업 캐스팅
	public void feedCarnivore(CarnivoreMarker carnivore) {
		System.out.println("고기 던지기");
	}

	public void feedharbiivore(HerbivoreMarker herbivore) {
		System.out.println("풀 던지기");
	}

	public static void main(String[] args) {

		InterfaceTest2 lab = new InterfaceTest2();
		Bear bear = new Bear();
		Deer deer = new Deer();

		lab.checkAnimal(bear);
		lab.checkAnimal(deer);
	}
}
