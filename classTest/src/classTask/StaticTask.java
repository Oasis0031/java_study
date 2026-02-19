package classTask;

public class StaticTask {
	int data = 10;
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	static void increase_s() {
		System.out.println(++data_s);
	}
	
	public static void main(String[] args) {
		
	}
}
