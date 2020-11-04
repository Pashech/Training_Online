package by.epam.string.main;

// В строке найти количество цифр.

public class Task_03 {

	public static void main(String[] args) {

		String str = "I was born in 1988";

		System.out.println(numbersOfDigit(str));
		
	}
	
	static int numbersOfDigit(String s) {
		char[] mass = s.toCharArray();
		int count = 0;
		for (int i = 0; i < mass.length; i++) {
			if (Character.isDigit(mass[i])) {
				count++;
			}
			
		}
		return count;
	}

}
