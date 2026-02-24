package interfaceTask1;

public class UnEmployee extends PersonActionAdapter{
   public UnEmployee() {;}
   public UnEmployee(String name, int age) {
      super(name, age);
   }
   
   @Override
   public void eat() {
      System.out.println("먹기만 한다.");
   }
   
}
