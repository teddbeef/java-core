package lab;

import java.util.Scanner;

public class Bai04 {
	public static void homework01() {
		System.out.println("HOMEWORK 01");
		int x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();

		if (a == 0 & b == 0) {
			System.out.println("PT Vo So Nghiem ");
		} else if (a == 0 & b != 0) {
			System.out.println("PT Vo Nghiem ");
		} else {
			x = -b / a;
			System.out.println("Nghiem cua PT la: " + x);
		}
		sc.close();
	}

	public static void homework02() {
		System.out.println("HOMEWORK 02");
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

	public static void homework03() {
		System.out.println("HOMEWORK 03");
		int payElectric;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter eclectric used: ");
		int electric = sc.nextInt();

		if (electric <= 100) {
			payElectric = electric * 1000;
			System.out.println("Pay: " + payElectric);

		} else {
			payElectric = (100 * 1000) + (electric - 100) * 1500;
			System.out.println("Pay: " + payElectric);
		}
	}

	public static void main(String[] args) {
		System.out.println(">>CHOSING FEATURES<<");
		System.out.println("++------------------------------------++");
		System.out.println("           1. HOMEWORK 01");
		System.out.println("           2. HOMEWORK 02");
		System.out.println("           3. HOMEWORK 03");
		System.out.println("           4. QUIT!!");
		System.out.println("++------------------------------------++");
		System.out.print("WHAT'S YOUR NUMBER? ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1: {
			homework01();
			break;
		}
		case 2: {
			homework02();
			break;
		}
		case 3: {
			homework03();
			break;
		}
		default:
			System.out.println("You're exit!!!");
			System.exit(0);
		}
	}
}
