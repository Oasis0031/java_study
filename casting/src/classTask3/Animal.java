package classTask3;

public class Animal {
   private String name;
   private int age;
   private String feed;
   
   public Animal() {;}
   public Animal(String name, int age, String feed) {
      this.name = name;
      this.age = age;
      this.feed = feed;
   }
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getFeed() {
      return feed;
   }
   public void setFeed(String feed) {
      this.feed = feed;
   }
   
   public void speak() {
      System.out.println(this.name + "웁니다!");
   }
}
