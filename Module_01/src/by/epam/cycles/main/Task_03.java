package by.epam.cycles.main;

// //Найти сумму квадратов первых ста чисел.

public class Task_03 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 99; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println("sum = " + sum);

	}

}
