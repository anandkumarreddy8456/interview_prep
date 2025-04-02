package java8fea;

interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }
}

interface MyInterface1 {
    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }
}
public class Java8StaticExample implements MyInterface,MyInterface1 {
	
    public static void main(String[] args) {
        Java8StaticExample obj = new Java8StaticExample();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		MyInterface1.super.defaultMethod();
	}
}