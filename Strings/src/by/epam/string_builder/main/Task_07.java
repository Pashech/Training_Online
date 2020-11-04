package by.epam.string_builder.main;

import java.util.Scanner;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".*/

public class Task_07 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст");

		String str = sc.nextLine();

		str = str.replaceAll("\\s+", "");

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {

			char c1 = sb.charAt(i);

			for (int j = sb.length() - 1; j > i; j--) {

				char c2 = sb.charAt(j);

				if (c1 == c2) {

					sb.deleteCharAt(j);
				}
			}
		}

		System.out.println(sb.toString());

	}

}
