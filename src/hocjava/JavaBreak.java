package hocjava;

public class JavaBreak {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				break; // If i = 5 will stop the loop
			}
			System.out.println("i: " + i);
		}

		for (int e = 1; e < 10; e++) {
			if (e == 5) {
				continue; // If e = 5 will continue run the loop, and skip the value e = 5
			}
			System.out.println("e: " + e);
		}
	}
}
