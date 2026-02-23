package classTask3;

public class Bear extends Carnivore{
   
   public Bear() {;}
   public Bear(String name, int age, String feed) {
      super(name, age, feed);
   }
   
   @Override
   public void speak() {
      System.out.println("크앙~");
   }
}
