package by.epam.linear_programms.main;

import java.util.Scanner;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

public class Task_05 {

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

		int seconds;

		int hour;
		int minutes;
		int sec;

		seconds = enterInt("Enter a number in seconds: ");

		hour = seconds / 3600;

		minutes = seconds % 3600 / 60;

		sec = seconds % 3600 % 60;

		System.out.println(hour + "h " + minutes + "mm " + sec + "ss ");

	}

}
