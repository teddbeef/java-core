package lab;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("Homework 02");
		double x, x1, x2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();
		System.out.println("Enter number c: ");
		int c = sc.nextInt();

		System.out.printf("Math is %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0 & b == 0) {
			System.out.println("PT Vo So Nghiem ");
		} else if (a == 0 & b != 0) {
			System.out.println("PT Vo Nghiem ");
		} else if (a != 0) {
			int delta = (int) (Math.pow(b, 2) - (4 * a * c));
			if (delta < 0) {
				System.out.println("PT Vo Nghiem ");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("PT Co Nghiem Kep: " + x);
			} else {
				x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
				x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.printf("PT Co 2 Nghiem Rieng Biet x1=%.2f , x2=%.1f", x1, x2);
			}
		}
		sc.close();
	}
}
