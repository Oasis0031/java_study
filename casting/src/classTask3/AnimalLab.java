package classTask3;

public class AnimalLab {
   private String name;
   
   public AnimalLab() {;}
   public AnimalLab(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   
   public void checkAnimal(Animal animal){
      if(animal instanceof Carnivore) {
         Carnivore carnivore = (Carnivore)animal;
         carnivore.printCarnivore();
         
         if(animal instanceof Lion) {
            Lion lion = (Lion)animal;
            lion.speak();
         }else {
            Bear bear = (Bear)animal;
            bear.speak();
         }
         
      }else if(animal instanceof Harbivore) {
         Harbivore harbivore = (Harbivore)animal;
         harbivore.printHarbivore();
         
         if(animal instanceof Koala) {
            Koala koala = (Koala)animal;
            koala.speak();
         }else {
            Deer deer = (Deer)animal;
            deer.speak();
         }
         
      }else if(animal instanceof Omivore) {
         Omivore omivore = (Omivore)animal;
         omivore.printOmivore();
         
         if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.speak();
         }else {
            Cat cat = (Cat)animal;
            cat.speak();
         }
         
         
      }else {
         System.out.println("모르는 동물!");
      }
   }
}

















