package multithreading;

public class ThreadNameAndProperties {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new MyThread1());
		Thread.currentThread().setName("Main Thread");
//		Thread.currentThread().setPriority(10);
		t1.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<10;i++) {
			System.out.println("class Tread");
		}

	}

}
class MyThread1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child THread");
		}
	}
	
}