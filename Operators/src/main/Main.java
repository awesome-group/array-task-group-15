package main;

public class Main {

	public static void main(String[] args) {

		byte a = 127;
		System.out.println(a);
		short b = 32456;
		System.out.println(b);
		int c = 214748366;
		System.out.println(c);
		long d = 324143534;
		System.out.println(d);
		float v = 99.09f;
		System.out.println(v);
		double z = 3425.54;
		System.out.println(z);
		boolean f = false;
		boolean t = true;
		boolean h = true;
		System.out.println(f & t);
		System.out.println(f != t);
		System.out.println(t == h);
		char l = 81;
		System.out.println(l);
		String str = "Vagif";
		System.out.println(str.toUpperCase());
		System.out.println(5 + b);
		System.out.println(b - a);
		System.out.println(20 * 100);
		System.out.println(9 / 3);
		System.out.println(9 % 7);
		System.out.println(b++);
		System.out.println(b--);
		System.out.println(100 < 20);
		System.out.println(9 >= 9);
		System.out.println(10 <= 2);
		System.out.println(f || t || f || f || f);
		System.out.println(a == 128 ? "a 128-e baraberdir." : "a 128-e beraber deyil.");
		System.out.println();

	}

}
