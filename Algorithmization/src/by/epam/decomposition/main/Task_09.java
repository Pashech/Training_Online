package by.epam.decomposition.main;

import java.util.Scanner;

import by.epam.one_dimensional_array.main.Input;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) 
вычисления его площади, если угол между сторонами длиной X и Y— прямой.*/

@SuppressWarnings("unused")
public class Task_09 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;

		a = enterInt("Enter a: ");
		b = enterInt("Enter b: ");
		c = enterInt("Enter c: ");
		d = enterInt("Enter d: ");

		double hyp = hypotenuse(a, b);
		double areaRectangularTriangle = areaOfRecTriangle(a, b);
		double areaSecondTriangle = areaTriangle(c, d, hyp);
		double areaRect = areaRectangle(areaSecondTriangle, areaRectangularTriangle);

		System.out.println("Площадь четырехугольника = " + areaRect);

	}

	// найдем площадь прямоугольного треугольника
	static double areaOfRecTriangle(int a, int b) {

		double area = a * b / 2;
		return area;
	}

	// найдем гипотенузу(она будет третьей стороной второго треугольника)
	static double hypotenuse(int a, int b) {
		double hyp;
		hyp = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		return hyp;
	}

	// найдем площадь второго треугольника
	static double areaTriangle(int a, int b, double c) {
		double halfMeter;
		halfMeter = (a + b + c) / 2; // полупериметр

		double area;
		area = Math.sqrt((halfMeter * (halfMeter - a) * (halfMeter - b) * (halfMeter - c)));
		return area;
	}

	// найдем площадь четырехугольника
	static double areaRectangle(double a, double b) {
		double rect = a + b;
		return rect;
	}

	public static int enterInt(String message) {

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
