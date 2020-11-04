package by.epam.one_dimensional_array.main;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;

@SuppressWarnings("unused")
public class Task_01 {

	public static void main(String[] args) {

		int s = 0;
		int size;
		
		size = Input.enterInt("Введите размер массива: ");

		int[] mass = new int[size];
		
		Input.initArray(mass);
		
		int k;
		
		k = Input.enterInt("\nenter k: ");
		
		for (int m : mass) {
			if (m % k == 0) {
				s = s + m;

			}
		}

		System.out.println("\nsum = " + s);

	}

}
