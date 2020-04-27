package by.epam.cycles.main;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task_06 {

	public static void main(String[] args) {
		
		for(char ch = 0; ch <= 255; ch++) {
			 
			System.out.println("value: " + (int)ch + " symbol: " + ch);
		}

	}

}
