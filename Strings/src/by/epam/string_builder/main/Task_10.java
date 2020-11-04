package by.epam.string_builder.main;

/*Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком. 
Определить количество предложений в строке X.*/

public class Task_10 {

	public static void main(String[] args) {

		String text = "About a thousand years ago, people known as the Vikings were known and feared throughout Europe!"
				+ "\n"
				+ "The Vikings were the people of the northern part of Europe, called Scandinavia, which includes the modern countries of Denmark, "
				+ "\n" + "Norway, and Sweden." + "\n" + "The Vikings made their living by farming and fishing?" + "\n"
				+ "However, by about the year 700, they began making attacks, " + "\n"
				+ "or raids, upon towns along the coasts of Europe in order to steal the wealth of those towns!";
		
		
		System.out.println("Количество предложений в строке: ");
		System.out.println(countSentences(text));
	}
	
	public static int countSentences(String text) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			if((text.charAt(i) == '!') || (text.charAt(i) == '.') || (text.charAt(i) == '?')) {
				count++;
			}
		}
		return count;
	}

}
