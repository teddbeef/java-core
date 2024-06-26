package hocjava;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int[] age = { 33, 26, 39, 11, 20 };

		Arrays.sort(age);
		System.out.println(Arrays.toString(age));

		for (int i = 0; i < age.length - 1; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] > age[j]) {
					int temp = age[i];
					age[i] = age[j];
					age[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(age));
	}
}
