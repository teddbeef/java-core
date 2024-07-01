package lab;

import java.util.Scanner;

public class Bai06 {
	public static void main(String[] args) {
		System.out.println("HOMEWORK - LAB03 - UNIT 2");
		System.out.print("Nhap 1 so nguyen bat ky: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		// Bang cuu chuong
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d ", x, i, x * i);
			System.out.print("\n");
		}
		sc.close();
	}
}
