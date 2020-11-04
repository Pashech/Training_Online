package by.epam.decomposition.main;

import java.util.Scanner;

// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task_03 {

	public static void main(String[] args) {
		int a;
		
		a = enterInt("Enter value: ");

		double areaTriangle;
		double areaHexagon;

		areaTriangle = areaOfTriangle(a);

		areaHexagon = areaOfHexagon(areaTriangle);

		System.out.println(areaHexagon);

	}

	static double areaOfTriangle(int a) {
		double squareTriangle;
		squareTriangle = Math.sqrt(3) * Math.pow(a, 2) / 4;
		return squareTriangle;
	}

	static double areaOfHexagon(double areaTriangle) {
		double areaHexagon = 6 * areaTriangle;
		return areaHexagon;
	}

	static int enterInt(String message) {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}

		value = sc.nextInt();
		return value;

	}
}
