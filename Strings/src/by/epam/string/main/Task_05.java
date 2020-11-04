package by.epam.string.main;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. 
Крайние пробелы в строке удалить.*/

public class Task_05 {

	public static void main(String[] args) {
		String str = "  I was  born   in  1988  ".trim();

		StringBuffer sb = new StringBuffer();

		boolean charSpace = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				if (!charSpace) {
					sb.append(" ");
				}

				charSpace = true;

			} else {
				sb.append(str.charAt(i));

				charSpace = false;
			}

		}
		System.out.println(sb.toString() + ".");

	}

}
