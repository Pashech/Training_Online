package by.epam.branching.main;

import java.util.Scanner;

/*Даны два угла треугольника (в градусах). 
Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.*/

public class Task_01 {

	public static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int v;

		System.out.println(message);

		while (!sc.hasNextInt()) {

			sc.next();

			System.out.println(message);
		}
		
		v = sc.nextInt();

		return v;

	}

	public static void main(String[] args) {

		int x;
		int y;

		x = enterInt("enter x: ");

		y = enterInt("enter y: ");

		if ((x + y >= 180) || (x <= 0 || y <= 0)) {
			System.out.println("There is not such triangle.");

		} else if ((x + y < 180)) {
			System.out.println("The triangle exists.");

			if ((x == 90) || (y == 90) || (x + y == 90)) {
				System.out.println("Rectangular triangle");

			}else {
				System.out.println("It is not rectangular");
			}

		}

	}

}
