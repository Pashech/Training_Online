package by.epam.string_builder.main;

// � ������� ������� ����������� � �������� ������������ ��������� �� ������ ����� ������������� ����� �����.

public class Task_04 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		String str = "�����������";
		String tort;

		char[] ch = str.toCharArray();

		tort = str.copyValueOf(ch, 7, 1) + str.copyValueOf(ch, 3, 2) + str.copyValueOf(ch, 7, 1);

		System.out.println(tort);

	}

}
