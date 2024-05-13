package hocjava;

public class JavaOperators {
	public static void main(String[] args) {
		/* Java Operators */
		System.out.println("Java Operators");
		int x = 3, y = 7;

		int sum = x + y; // Addition
		int sub = y - x; // Subtraction
		int mul = x * y; // Multiplication
		double div = y / x; // Division
		float mod = y % x; // Returns the division remainder Returns the division remainder

		System.out.println("Addition = " + sum);
		System.out.println("Subtraction = " + sub);
		System.out.println("Multiplication = " + mul);
		System.out.println("Division = " + div);
		System.out.println("Returns the division remainder Returns the division remainder = " + Math.round(mod));

		/* Java Assignment Operators */
		System.out.println("===============================================================================");
		System.out.println("Java Assignment Operators");

		int e = 10;
		e += 5;
		int u = 40;
		u -= 10;
		System.out.println("e = " + e);
		System.out.println("u = " + u);

		/* Java Comparison Operators */
		System.out.println("===============================================================================");
		System.out.println("Java Comparison Operators");
		int a = 23;
		int b = 55;

		System.out.println(a == b); // Equal to
		System.out.println(b >= a); // Greater than or equal to
		System.out.println(a != b); // Not equal

		/* Java Logical Operators */
		System.out.println("===============================================================================");
		System.out.println("Java Logical Operators");

		int c = 29;
		int d = 30;
		System.out.println(c > 20 && d < 30); // Logical and
		System.out.println(c > 20 || d < 30); // Logical or
		System.out.println(!(c > 20 && d < 30)); // Logical not. Reverse the result, returns false if the result is true
	}

}
