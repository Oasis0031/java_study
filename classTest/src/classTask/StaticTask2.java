package classTask;

// 학생(Student)
// 이름, 학번, 국어점수, 영어점수, 수학점수
// 학생들은 총점과 평균을 출력해주는 메서드를 가지고 있습니다.
// 또한 학생들의 총 숫자를 출력할 수 있습니다.
// 필요시 필드는 추가로 구현할 수 있습니다.

// 학생 3명을 객체화 하고
// 각각 학생의 총점과 평균을 출력
// 학생의 총 수를 출력

class Student {
   static int count; // 0
   String name; // null
   int number; // 0
   int kor;
   int eng;
   int math;
   int total;
   double average; // 0.0
   int point;
   Long data1; // 0L
   float data2; // 0.0F
   boolean data3; // false
   
//   클래스의 초기값 null
//   Student st; // null
   
   public Student() {;}
   public Student(String name, int number, int kor, int eng, int math) {
      this.name = name;
      this.number = number;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.total = kor + eng + math;
      this.average = Double.parseDouble(String.format("%.2f", total / 3.0));
   }
   
//      스태틱 블럭
   static {
      System.out.println("시험을 응원합니다!");
   }
   
//      초기화 블럭
   {
      this.point = 5000;
      count++;
   }
   
   
   void introduce() {
      System.out.printf("%s님의 점수\n총 점: %d점\n평 균: %.2f점\n", this.name, this.total, this.average);
   }
   
   void printTotalStudent() {
      System.out.println("총 학생 수: " + count + "명");
   }
   
}

public class StaticTask2 {
   public static void main(String[] args) {
      Student hong = new Student("홍길동", 1, 30, 50, 60);
      Student jang = new Student("장보고", 2, 70, 80, 80);
      Student lee = new Student("이순신", 3, 40, 80, 100);
      Student kim = new Student();
      
      hong.introduce();
      jang.introduce();
      lee.introduce();
      
      kim.printTotalStudent();
      
      
      
   }
}
















