package multithreading;

public class ThreadPreventingMethods {

	public static void main(String[] args) {
		MyThread2 mt=new MyThread2();
		mt.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread"+i);
		}

	}

}
class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("Child Thread"+i);
		}
		
	}
	
}