package multithreading;

public class ImplementingThreadClass {
//  Defining a Thread by implementing Runnable interface:
	public static void main(String[] args) {
		Runnable r=new Mythread();
		Thread t1=new Thread(r);
		t1.start();
		for(int i=0;i<15;i++) {
			System.out.println("Main Thread");
		}
		
	}

}
class Mythread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
		}
		
	}
	
}
