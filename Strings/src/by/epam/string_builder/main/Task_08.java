package by.epam.string_builder.main;


import java.util.Scanner;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/
public class Task_08 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст: ");
		
		String text = sc.nextLine().trim();
		System.out.println(maxWord(text));
		

	}
	
	public static String maxWord(String text) {
String[] splitLine = text.split(" ");
		
		String maxWord = splitLine[0];
		
		int max = splitLine[0].length();
		
		
		for(int i = 1; i < splitLine.length; i++) {
			
			if(max < splitLine[i].length()) {
				maxWord = splitLine[i];
			}
			
		}
		return maxWord;
	}

}
