package by.epam.sorted.main;

import java.util.Arrays;
import java.util.Scanner;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.*/

public class Task_01 {

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

	public static void main(String[] args) {

		int m;
		int n;

		int k;

		m = enterInt("Enter m: ");
		n = enterInt("Enter n: ");
		k = enterInt("Enter k: ");

		int[] mass = new int[m];
		int[] array = new int[n];
		System.out.println("Первый массив: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 10);
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Второй массив: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();

		mass = Arrays.copyOf(mass, mass.length + array.length);

		// перемещаем элементы после К-го элементав в конец массива
		
		for (int i = mass.length - array.length - 1; i >= k - 1; i--) {
			mass[array.length + i] = mass[i];
		}

		for (int i = 0; i < array.length; i++) {
			mass[k + i] = array[i];
		}
		
		System.out.println("Итоговый массив: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
	}

}
