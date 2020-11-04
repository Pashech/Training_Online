package by.epam.decomposition.main;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task_07 {

	public static void main(String[] args) {

		System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 = " + sumFact());

	}

	static int factorial(int a) {
		int result;
		int i;
		result = 1;
		for (i = 1; i <= a; i++) {
			result *= i;

		}

		return result;
	}

	static int sumFact() {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				sum += factorial(i);
			}
		}

		return sum;

	}

}
