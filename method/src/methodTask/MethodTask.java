package methodTask;

public class MethodTask {
	
	void oneToTenPrinter() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	};
	
	double returner(double num) {
		double sum = 0;
		for(int i = 0; i < num; i++) {
			sum += num + (i + 1);			
		}
		return sum;
	};
	
	
   public static void main(String[] args) {
//      1. 1~10까지 출력하는 메서드
//      2. 1~n까지의 합을 반환해주는 메서드
	   MethodTask mt = new MethodTask();
	   double total = mt.returner(11.5);
	   
	   mt.oneToTenPrinter();
	   System.out.println(total);
   }
}
