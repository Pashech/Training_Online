package by.epam.cycles.main;

import java.util.Scanner;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: aₙ = 1/2ₙ + 1/3ₙ
*/

public class Task_05 {
	
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
		
		double e;
		double sum = 0;
		
		e = enterDouble("enter e: ");

		for (int n = 1;; n++) {

			double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));

			if (Math.abs(a) <= e)

				break;

			sum += a;
		}

		System.out.print("sum = " + sum);
		

	}

}
