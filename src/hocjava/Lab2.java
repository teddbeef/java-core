package hocjava;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		System.out.println("CHOOSE THE FEATUERS");
		System.out.println("++ ---------------- ++");
		System.out.println("| 1. Addition        |");
		System.out.println("| 2. Subtraction     |");
		System.out.println("| 3. Exit!!          |");
		System.out.println("++ ---------------- ++");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your chosing number: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You entered number 1. It is Addition.");
			break;
		case 2:
			System.out.println("You entered number 2. It is Subtraction.");
			break;
		default:
			System.out.println("You chosen exiting!!");
			System.exit(0);
		}
		sc.close();
	}
}
