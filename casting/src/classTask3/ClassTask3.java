package classTask3;

// 동물 연구소 클래스
// checkAnimal(){}
//각각 동물이 들어오면 어떤 동물에 속하는지 출력해주는 메서드

// 동물들이 들어오면 각각의 동물들을 분리한다.
// 초식동물(Harbivore)
//- 코알라, 사슴

// 육식동물(Carnivore)
//- 사자, 곰

// 잡식동물(Omivore)
//- 강아지, 고양이

public class ClassTask3 {
   public static void main(String[] args) {
      AnimalLab lab = new AnimalLab();
      Animal[] animals = {
            new Cat("치즈", 20, "츄르"),
            new Dog("얼룩이", 3, "사료"),
            new Bear("곰탱이", 5, "사람"),
            new Deer("밤비", 3, "풀"),
            new Koala("알라", 5, "풀"),
            new Lion("심바", 10, "고기")
      };
      
      for(Animal animal : animals) {
         lab.checkAnimal(animal);
      }
   }
}










