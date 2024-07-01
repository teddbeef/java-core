package lab;

import java.util.Scanner;

public class Bai05 {
	public static void main(String[] args) {
		System.out.println("HOMEWORK - LAB03 - UNIT 1");
		System.out.print("Nhap 1 so nguyen bat ky: ");
		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();
		int count = 0;

		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				System.out.println("Uoc so nguyen khac: " + i);
				count++;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to ", value);
		} else {
			System.out.printf("%d khong la so nguyen to ", value);
		}
	}
}
