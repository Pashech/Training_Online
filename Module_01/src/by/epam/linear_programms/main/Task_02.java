package by.epam.linear_programms.main;

import java.util.Scanner;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения): (b+√(b²+4ac))/2a - a³с + b⁻ ²

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

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		double result;

		a = enterDouble("enter a: ");

		b = enterDouble("enter b: ");

		c = enterDouble("enter c: ");

		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

		System.out.println("function value: " + result);

	}

}
