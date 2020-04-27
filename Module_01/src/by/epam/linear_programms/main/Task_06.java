package by.epam.linear_programms.main;

import java.util.Scanner;

/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
принадлежит закрашенной области, и false — в противном случае:
*/
public class Task_06 {

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

		int x;
		int y;

		x = enterInt("Enter x: ");

		y = enterInt("Enter y: ");

		if ((x >= -4 && x <= 4) && (y <= 4 && y >= -3)) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

	}
}
