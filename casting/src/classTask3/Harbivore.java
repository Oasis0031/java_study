package classTask3;

public class Harbivore extends Animal{
   public Harbivore() {;}
   public Harbivore(String name, int age, String feed) {
      super(name, age, feed);
   }
   
   public void printHarbivore() {
      System.out.println(super.getName() + "은 초식동물!");
   }
   
}
