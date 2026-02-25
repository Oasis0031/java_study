package InnerClassTest;

public class InnerClassTest {
   
   class InnerClass {
      private int value;
      
      {
         this.value = 20;
      }
      
      public InnerClass() {;}
      public InnerClass(int value) {
         this.value = value;
      }
      
      public int getValue() {
         return value;
      }
      public void setValue(int value) {
         this.value = value;
      }
      
      public void printValue() {
         System.out.println(this.getValue());
      }
   }
   
   public static void main(String[] args) {
      InnerClassTest it = new InnerClassTest();
      InnerClassTest.InnerClass inner = new InnerClassTest().new InnerClass();
   }

}
















