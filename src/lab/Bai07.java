package lab;

import java.util.Arrays;
import java.util.Scanner;

public class Bai07 {
	public static void main(String[] args) {
		System.out.println("HOMEWORK - LAB03 - UNIT 3");
		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter the number of size of array: ");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array element: ");
		// For reading the element
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		// For print the array element
		for (int i : a) {
			System.out.println(i + " ,");
		}
		// Sort array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		// Find min max after sort
		System.out.println("Min = " + a[0]);
		System.out.println("Max = " + a[a.length - 1]);
		// Another way to find max/min
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

}
