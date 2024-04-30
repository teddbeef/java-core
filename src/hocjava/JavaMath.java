package hocjava;

import java.util.Scanner;

public class JavaMath {
	public static void main(String[] args) {
		double firstNunber;
		double secondNumber;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter x number: ");
		int x = scanner.nextInt();
		System.out.print("Enter y number: ");
		int y = scanner.nextInt();

		firstNunber = Math.pow(x, y);
		System.out.println("The value of the first number is: " + firstNunber);

		secondNumber = Math.sqrt(x);
		System.out.println("The value of the second number is: " + Math.round(secondNumber));

		System.out.print("The max number is: " + Math.max(firstNunber, secondNumber));
		System.out.print("\nThe min number is: " + Math.min(firstNunber, secondNumber));
		scanner.close();
	}
}
