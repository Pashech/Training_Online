package by.epam.linear_programms.main;

import java.util.Scanner;

// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task_01 {
	
	public static double enterDouble(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double v;
		
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}
		v = sc.nextDouble();
		return v;
		
	}

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double result;
		
		a = enterDouble("Enter a: ");
		b = enterDouble("Enter b: ");
		c = enterDouble("Enter c: ");
		
		result = ((a - 3) * b / 2) + c;
		
		System.out.println("function value: " + result);
		

	}

}
