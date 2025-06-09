package linkedinProbleSolving;

public class Q11MultipleExceptionCatchblock {
//  11. Write a Java program to handle multiple exceptions in a single catch block
	public static void main(String[] args) {
		multipleCatch(3);
		singleCatch();
	}
	public static void multipleCatch(int num) {
		try{
			System.out.println("Hello I am Multi Catch Exception");
		}catch(NullPointerException  | ArrayIndexOutOfBoundsException w ) {
			System.out.print("Multple Exception");
		}
		
	}
	public static void singleCatch() {
		try{
			System.out.print("Hello I am Single Catch");
		}catch(Exception e) {
			System.out.print("Multple Exception");
		}
	}

}
