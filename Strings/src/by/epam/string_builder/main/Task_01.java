package by.epam.string_builder.main;

// ��� ����� (������). ������� ���������� ���������� ������ ������ �������� � ���.

public class Task_01 {

	public static void main(String[] args) {

		String str = "Find the largest     number of   consecutive spaces in it";

		int x = maxIndex(str);

		System.out.println("���������� ���������� �������� ������: " + x);

	}

	static int maxIndex(String s) {

		int count = 0;

		int[] mass = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {
				count++;

				mass[i] = count;

			} else {
				count = 0;
			}

		}
		int max;
		max = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (max < mass[i]) {
				max = mass[i];
			}
		}

		return max;
	}

}
