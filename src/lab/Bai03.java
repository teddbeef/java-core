package lab;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("Homework 03");
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
}
