package by.epam.cycles.main;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task_04 {

	public static void main(String[] args) {

		long comp = 1;

		for (int i = 1; i <= 200; i++) {
			if (comp >= 9223372036854775807L) {
				System.out.println("out of range");
				break;
			}

			comp *= Math.pow(i, 2);

			System.out.println("composition = " + comp);
		}

	}

}
