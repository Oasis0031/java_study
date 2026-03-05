package thread;

public class ThreadTest {
	public static void main(String[] args) {
		
//		Thread1 thread_1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
		
//		thread_1.start();
//		thread2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
	
		Thread thread1 = new Thread(target1, "★");
		Thread thread2 = new Thread(target2, "♥");
		
		thread1.start();
		thread2.start();
		
//		thread1.setPriority(1);
//		thread2.setPriority(10);
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인쓰레드");
	}
}
