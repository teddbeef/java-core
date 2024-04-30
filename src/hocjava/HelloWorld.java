package hocjava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("My name is: ");
		String name = scanner.nextLine();
		System.out.print("My age is: ");
		int age = scanner.nextInt();

		System.out.println("My name is " + name + " and I am " + age + " year old");
		scanner.close();
	}
}
