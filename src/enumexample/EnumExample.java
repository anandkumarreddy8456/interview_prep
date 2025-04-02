package enumexample;

public class EnumExample {

	public static void main(String[] args) {
		//day use 
		Day today=Day.MONDAY;
		System.out.println(today);
		Plantets plan=Plantets.VENUS;
		System.out.println(plan.mass());
		//

	}

}

enum Day{
	SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
enum Plantets{
	MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6);
	private final double mass;
	private final double  radius;
	
	Plantets(double mass,double radius){
		this.mass=mass;
		this.radius=radius;
	}
	public double mass() {
		return mass;
	}
	public double radius() {
		return radius;
	}
}