package classTask2;

public class Monster {
   private String name;
   private int hp;
   
   public Monster() {;}
   
   public Monster(String name, int hp) {
      super();
      this.name = name;
      this.hp = hp;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   public void dropItem() {
      System.out.println("전리품을 드랍한다.");
   }
}
