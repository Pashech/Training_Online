package by.epam.string_builder.main;

import java.util.Scanner;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
Учитывать только английские буквы.*/

public class Task_09 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст: ");

		String text = sc.nextLine().trim();

		count(text);

	}

	public static void count(String text) {
		text = text.replaceAll("\\s+", "");

		int countUpperCase = 0;
		int countLowerCase = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) > 'A' && text.charAt(i) < 'Z') {
				countUpperCase++;
			} else {
				countLowerCase++;
			}
		}

		System.out.println(
				"Количество прописных букв: " + countUpperCase + "\n" + "Количество строчных букв: " + countLowerCase);
	}

}
