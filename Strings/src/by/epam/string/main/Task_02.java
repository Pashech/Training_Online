package by.epam.string.main;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task_02 {

	public static void main(String[] args) {

		String str = "It is word The word is important for our life";
		
		String letter = changeWords(str);
        System.out.println(str);
        System.out.println(letter);

	}
	
	  private static String changeWords(String word) {
		  
	        StringBuilder strBuilder = new StringBuilder();
	        
	        String letter;
	        
	        for (int i = 0; i < word.length(); i++) {
	            if (i + 3 < word.length() && word.charAt(i) == 'w'
	                                  && word.charAt(i + 1) == 'o'
	                                  && word.charAt(i + 2) == 'r'
	                                  && word.charAt(i + 3) == 'd') {
	                strBuilder.append("letter");
	                i += 3;
	            } else {
	                strBuilder.append(word.charAt(i));
	            }
	        }
	        letter = strBuilder.toString();
	        return letter;
	    }

}
