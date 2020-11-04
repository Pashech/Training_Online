package by.epam.string_builder.main;

import java.util.Scanner;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class Task_06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст");

		String sentence = sc.nextLine();

		System.out.println(doubleLetter(sentence));

		

	}
	
	public static String doubleLetter(String text) {
		StringBuilder sb = new StringBuilder(text);

		for (int i = 0; i < sb.length(); i += 2) {

			sb.insert(i, sb.charAt(i));
		}
		
		return sb.toString();
	}

}
