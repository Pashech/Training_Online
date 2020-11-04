package by.epam.regular_expression.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции: 
отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине; 
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, 
а в случае равенства – по алфавиту
*/
public class Task_01 implements Comparator<String> {

	public static void main(String[] args) {

		String str = "London is the capital of the United Kingdom, one of the largest and one of the world’s most enjoyable cities. It offers the tourists an astonishing variety of scene. In this historic city the modern rubs shoulders with the old, the present is ever conscious of the past, the great and the small live side by side in mutual tolerance and respect.\n"
				+ "London is more than 20 centuries old. Its buildings express all the different areas of its history, for London manages in a unique way to reflect its past and at the same time to fulfil the functions of a modern city.\n"
				+ "The City, the oldest part of London, is the commercial and financial centre of the country. Westminster is the political heart of London. The West End is the richest and the most beautiful part of London, the symbol of wealth and luxury, where the most expensive hotels, restaurants, shops and clubs are situated. The East End is the industrial part. There are many factories, workshops and shipyards there.\n"
				+ "London offers the visitors a great variety of places of interest. It’s a city of dream to everybody interested in the English history and culture.";

		System.out.println("Абзацы отсортированы по количеству предложений: \n");

		sortParagraph(str);
		System.out.println();

		System.out.println("Слова отсортированы в предложениях: \n");

		sortWords(str);
		System.out.println();

		System.out.println("Сортировка вхождений заданного символа: \n");

		sortLiteral(str, 'e');

	}

	private static void sortParagraph(String text) {
		String[] paragraphs = text.split("\\n");
		int count = 0;

		Map<String, Integer> map = new TreeMap<>();
		for (String paragr : paragraphs) {
			for (String s1 : paragr.split("[.!?]")) {
				count++;
			}
			map.put(paragr, count);
			count = 0;
		}
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

	public static void sortWords(String text) {

		Pattern pattern = Pattern.compile("[.!?]");
		String[] mass = pattern.split(text);

		List<String> w = new ArrayList<String>();
		Comparator<String> comp = new Task_01();

		for (String words : mass) {
			words = words.trim();

			Collections.addAll(w, words.split("\\s*([ ,;:.«»\\-—])\\s*"));

			Collections.sort(w, comp);
			System.out.println(w);
			w.clear();

		}
	}

	private static void sortLiteral(String text, char letter) {
		if (text.indexOf(letter) != -1) {
			String[] sentences = text.split("([.!?]+)");
			for (String s : sentences) {
				String[] mass = s.split("\\W");
				for (int k = 0; k < mass.length; k++) {
					if (mass[k].indexOf(letter) == -1) {
						mass[k] = mass[k].replaceAll(".", "");
					}
				}
				for (int k = 0; k < mass.length; k++) {
					for (int j = 0; j < mass.length - 1; j++) {
						if (countLetter(mass[j], letter) > countLetter(mass[j + 1], letter)) {
							String temp = mass[j];
							mass[j] = mass[j + 1];
							mass[j + 1] = temp;
						}
					}
				}
				for (int k = 0; k < mass.length; k++) {
					for (int j = 0; j < mass.length - 1; j++) {
						if (countLetter(mass[j], letter) == countLetter(mass[j + 1], letter)
								&& mass[j].compareTo(mass[j + 1]) > 0) {
							String temp = mass[j];
							mass[j] = mass[j + 1];
							mass[j + 1] = temp;
						}
					}
				}

				int count = 1;

				for (String a : mass) {
					if (!a.equals("")) {
						if (count == mass.length) {
							System.out.print(a);
							System.out.println();
						} else {
							System.out.print(a + " ");
						}
					}
					count++;
				}
			}
		} else {
			System.out.println("Отсутствует");
		}
	}

	public static int countLetter(String str, char letter) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}

	public int compare(String ob1, String ob2) {

		return ob1.length() - ob2.length();

	}

}
