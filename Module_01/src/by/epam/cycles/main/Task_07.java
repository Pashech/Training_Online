package by.epam.cycles.main;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
*/

public class Task_07 {
	
	public static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int value;
		
		System.out.println(message);
		
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println(message);
		}
		
		value = scan.nextInt();
		
		return value;
	}

	public static void main(String[] args) {
		// Enter a range of numbers
		int m;
		int n;

		m = enterInt("Enter m: ");
		n = enterInt("Enter n: ");

		for (int i = m; i < n; i++) {
			System.out.print("dividers " + i + ": ");

			for (int j = 2; j < i; j++)
				if ((i % j) == 0) {
					System.out.print(j + " ");
				}
			System.out.println();

		}

	}

}
