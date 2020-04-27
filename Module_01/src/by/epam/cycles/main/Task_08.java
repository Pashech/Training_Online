package by.epam.cycles.main;

import java.util.Scanner;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task_08 {

	public static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int value;

		System.out.println(message);

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println(message);
		}

		value = scan.nextInt();

		return value;
	}

	public static void sameNumbers(int a, int b) {
		int c;
		int d;

		while (a > 0) {
			d = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				if (c % 10 == d) {
					System.out.print(d + " ");
					break;
				}
				c = c / 10;
			}
		}

	}

	public static void main(String[] args) {
		int a;
		int b;

		a = enterInt("Enter a: ");

		b = enterInt("Enter b: ");

		sameNumbers(a, b);

	}

}
