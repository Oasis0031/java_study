package classTask3;

public class Lion extends Carnivore{
   
   public Lion() {;}
   public Lion(String name, int age, String feed) {
      super(name, age, feed);
   }
   
   @Override
   public void speak() {
      System.out.println("어흥~");
   }
}
