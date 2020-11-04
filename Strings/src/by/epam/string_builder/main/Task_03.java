package by.epam.string_builder.main;

// ���������, �������� �� �������� ����� �����������.

public class Task_03 {

	public static void main(String[] args) {
		
		String str = "level";
		
		isPalindrom(str);
		
		// �������� ����� ����� � �������	

	}
	
	static void isPalindrom(String s) {

		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		
		if(s.equals(sb.toString())) {
			System.out.println("�������� �����������");
		}else {
			System.out.println("�� ��������");
		}
		
		
	}

}
