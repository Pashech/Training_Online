package by.epam.branching.main;

import java.util.Scanner;

// Найти max{min(a, b), min(c, d)}.

public class Task_02 {

	public static double enterDouble(String message) {

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

	public static double min(double a, double b) {
		return a < b ? a : b;
	}

	public static double max(double a, double b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {

		double a;
		double b;

		double x;
		double y;

		double result;

		a = enterDouble("enter a: ");
		b = enterDouble("enter b: ");

		x = enterDouble("enter x: ");
		y = enterDouble("enter y: ");

		result = max(min(a, b), min(x, y));

		System.out.println("max value = " + result);

	}

}
