package multithreading;

public class ExtendingThreadClass {
//   Defining a Thread by extending "Thread class":
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Method");
		}

	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread Method");
		}
	}
}