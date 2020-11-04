package by.epam.string_builder.main;

// � ������ �������� ����� ������� ������� 'a' ������ 'b'.

public class Task_02 {

	public static void main(String[] args) {
		
		String str = "Most people know that the English language is spoken by many millions of people around the world.";
		
		System.out.println(editor(str));
		
		
	}
	
	static String editor(String s) {
		s = s.replace("a", "ab");
		
		return s;
	}
	
	

}
