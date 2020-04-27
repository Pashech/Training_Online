package by.epam.cycles.main;

import java.util.Scanner;

/*Напишите программу, где пользователь вводит любое целое положительное число. 
А программа суммирует все числа от 1 до введенного пользователем числа.*/

public class Task_01 {
	
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
		int sum = 0;
		
		x = enterInt("Enter x: ");
		
		for(int i = 1; i < x; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers = " + sum);

	}

}
