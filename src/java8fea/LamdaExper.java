package java8fea;

public class LamdaExper {

	public static void main(String[] args) {
//		without java8
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I am Good");
				
			}
		};
		new Thread(runnable).start();
//		with java 8 
//		Runnable runnable2=()->System.out.println("I am Java 8");
//		new Thread(runnable2).start();
		Runnable runnable2=()->System.out.println("Hello I am Anand");
		new Thread(runnable2).start();

	}

}
