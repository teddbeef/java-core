package hocjava;

import java.util.Scanner;

public class JavaIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tax;
		System.out.println("Enter your tax: ");
		tax = sc.nextInt();
		System.out.println("You entered the tax is: " + tax);

		if (tax < 10) {
			System.out.println("You no need to pay anything!");
		} else if (tax == 10 || tax <= 15) {
			System.out.println("You need to pay 10% of the total tax");
		} else if (tax == 15 || tax <= 30) {
			System.out.println("You need to pay 20% of the total tax");
		} else {
			System.out.println("You need to pay 50% of the total tax");
		}
		sc.close();
	}
}
