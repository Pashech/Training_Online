package by.epam.string_builder.main;



// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task_05 {

	public static void main(String[] args) {

		String str = "There have been many great writers in the history of English literature.";
		char ch = 'a';

		System.out.println(countWord(str, ch));
	}

	public static int countWord(String str, char ch) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

}
