package by.epam.branching.main;

import java.util.Scanner;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task_03 {

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

		int x1;
		int y1;

		int x2;
		int y2;

		int x3;
		int y3;

		x1 = enterInt("Enter x1: ");
		y1 = enterInt("Enter y1: ");

		x2 = enterInt("Enter x2: ");
		y2 = enterInt("Enter y2: ");

		x3 = enterInt("Enter x3: ");
		y3 = enterInt("Enter y3: ");

		if (((x1 - x3) * (y2 - y3)) - ((x2 - x3) * (y1 - y3)) == 0) {
			System.out.println("The points lie on the same straight line");
		} else {
			System.out.println("points don't lie on the same straight line");
		}

	}

}
