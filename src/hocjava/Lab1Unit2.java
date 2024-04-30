package hocjava;

import java.util.Scanner;

public class Lab1Unit2 {
	public static void main(String[] args) {
		double perimeter; // chuvi
		double area; // dientich

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter width: ");
		double width = scanner.nextDouble();
		System.out.print("Enter height: ");
		double height = scanner.nextDouble();

		perimeter = (width + height) * 2;
		area = width * height;

		System.out.println("The perimeter is: " + Math.round(perimeter));
		System.out.println("The area is: " + Math.round(area));
		System.out.println("The samllest edge is: " + Math.min(area, height));
		scanner.close();
	}
}
