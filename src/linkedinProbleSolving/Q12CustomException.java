package linkedinProbleSolving;
import java.util.*;

public class Q12CustomException {
//  Q13.Create a custom exception and handle it in a program
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Age ");
		sc.close();

	}
	public static void checkEligibility(int num) {
		try {
			if(num<18) {
				throw new VoteEligibility(num+" years  is not Eligible to vote");
			}else {
				System.out.println(num+" years is Eligible to Vote");
			}
		}catch(VoteEligibility v) {
			System.out.println(v.getMessage());
		}
	}

}
@SuppressWarnings("serial")
class VoteEligibility extends RuntimeException{
	
	 VoteEligibility(String message) {
		super(message);
	}
	
}
