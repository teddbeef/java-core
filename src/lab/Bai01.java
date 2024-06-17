package lab;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		int x;
		System.out.println("Homework 01");
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
}
