package by.epam.linear_programms.main;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях.
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

import java.util.Scanner;

public class Task_04 {

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

		double x;
		double y;

		x = enterDouble("Enter number: ");

		y = (x * 1000) % 1000 + (int) x / 1000.0;

		System.out.println(y);

	}

}
