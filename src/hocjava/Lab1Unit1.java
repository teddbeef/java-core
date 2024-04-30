package hocjava;

import java.util.Scanner;

public class Lab1Unit1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student's name: ");
		String stuName = scanner.nextLine();
		System.out.print("Score: ");
		double stuScore = scanner.nextDouble();

		System.out.println(stuName + " got the score last semester was: " + stuScore);
		scanner.close();
	}
}
