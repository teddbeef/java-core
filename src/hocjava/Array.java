package hocjava;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] cars = { "Audi", "Mercedes", "Porsche", "Civic" };
		cars[3] = "Vinfast";
		System.out.println(Arrays.toString(cars)); // to print a array
		System.out.println(cars[1]);
		System.out.println(cars.length);

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
