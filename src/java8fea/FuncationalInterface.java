package java8fea;

public class FuncationalInterface {
	public static void main(String[] args) {
		Collage collage=(a,b)-> a+b;
		System.out.println(collage.addstudent(1,9));
		School school=(a,b)->a*b;
		System.out.println(school.multiple(23, 5));
		
	}

}
@FunctionalInterface
interface Collage{
	 int addstudent(int a,int b);
//	public string updatestudent();
}

interface School{
	long multiple(int a,int b);
}