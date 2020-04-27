package by.epam.cycles.main;

import java.util.Scanner;

// Вычислить значения функции на отрезке [а,b] c шагом h: y = x, если x > 2; и y = -x, если x <= 2;

public class Task_02 {
	
	public static double enterValue(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double value;

		System.out.println(message);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}

		value = sc.nextDouble();

		return value;

	}

	public static void main(String[] args) {
		// enter a segment
		double a;
		double b;
		
		double h; // step
		
		double x;
		double functionResult;

		a = enterValue("Enter a: ");
		b = enterValue("Enter b: ");
		h = enterValue("Enter h: ");

		for (x = a; x <= b - h; x += h) {

			if (x > 2) {
				functionResult = x;
				System.out.println(functionResult);

			} else {
				functionResult = -x;
				System.out.println(functionResult);
			}

		}


	}

}
