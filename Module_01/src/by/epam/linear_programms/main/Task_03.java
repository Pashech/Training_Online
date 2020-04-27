package by.epam.linear_programms.main;

import java.util.Scanner;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения): (sin x + cos y)

public class Task_03 {
	
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
		
		double x;
		double y;

		x = enterDouble("enter x: ");

		y = enterDouble("enter y: ");

		double result;

		result = (Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.cos(y));
		
		System.out.println("function value: " + result);

	}

}
