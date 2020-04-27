package by.epam.branching.main;

import java.util.Scanner;

// Вычислить значение функции: f(x) = x^2 - 3x +9, если x <= 3; и f(x) = 1 / (x^3 + 6), если  x > 3;

public class Task_05 {

	public static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}

		value = sc.nextInt();

		return value;

	}

	public static void main(String[] args) {

		int x;
		double functionResult;

		x = enterInt("Enter x: ");

		if (x <= 3) {
			functionResult = (Math.pow(x, 2)) - (3 * x) + 9;
			System.out.println("functionresult = " + functionResult);
		} else {
			functionResult = 1 / ((Math.pow(x, 3) + 6));
			System.out.println("functionresult = " + functionResult);
		}

	}

}
