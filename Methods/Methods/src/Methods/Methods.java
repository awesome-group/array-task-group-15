package Methods;

public class Methods {

	public static void main(String[] args) {

		Test t = new Test();
		t.b = 234;
		System.out.println(toplama(15.3, 24));
		System.out.println(print());
		voidMethod();
		prinName("Vagif", "Dadaszade");
		System.out.println(factorial(5));
	}
	
	static int factorial(int n) {
		if(n==1)
			return 1;
		
		return n*factorial(n-1);
	}

	static double toplama(double a, int b) {
		return a + b;
	}
	static double toplama(int a, double b) {
		return a + b;
	}
	static int toplama(int a, int b) {
		return a + b;
	}

	static String print() {
		return "Hello Java";
	}

	static void voidMethod() {
		System.out.println("JRE,JVM");
	}

	static void prinName(String name, String surname) {
		System.out.println(name +" "+ surname);
	}

}
