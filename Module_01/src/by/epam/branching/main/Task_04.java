package by.epam.branching.main;

import java.util.Scanner;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Task_04 {
	
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
		
		int width;
		int height;

		int x;
		int y;
		int z;

		// Enter the hole size

		width = enterInt("Enter width: ");
		height = enterInt("Enter height: ");

		// enter the dimensions of the brick

		x = enterInt("Enter x: ");
		y = enterInt("Enter y: ");
		z = enterInt("Enter z: ");

		
		if ((x < width) && (y < height) || 
			(x < width) && (z < height) || 
			(y < width) && (z < height) || 
			(z < width) && (y < height) || 
			(y < width) && (x < height) ||
			(z < width) && (x < height))  {
			System.out.println("the brick passes through the hole");
		}else {
			System.out.println("the brick does not pass through the hole");
		}
		

	}

}
