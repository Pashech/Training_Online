package by.epam.string.main;

// В строке найти количество чисел.

public class Task_04 {

	public static void main(String[] args) {

		String str = "I was 199 88 ггг 99 ";

		System.out.println(numberOfNumbers(str));

	}

	static int numberOfNumbers(String s) {

		char[] mass = s.toCharArray();

		int count = 0;

		for (int i = 0; i < mass.length - 1; i++) {

			if (Character.isDigit(mass[i])) {

				if (!Character.isDigit(mass[i + 1])) {
					count++;
				}

			}

		}

		if (Character.isDigit(mass[mass.length - 1])) {
			count++;
		}

		return count;
	}

}
