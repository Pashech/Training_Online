package by.epam.airline.input;

import java.util.Scanner;

public class UserInput {
	
	public String userInput(String message) {
		
		System.out.println(message);
		
		Scanner sc = new Scanner(System.in);
		
		String value;
		
		while(!sc.hasNextLine()) {
			sc.nextLine();
			System.out.println(message);
		}
		
		value = sc.nextLine();
		
		return value;
		
		
	}
	
public int userInputInt(String message) {
		
		System.out.println(message);
		
		Scanner sc = new Scanner(System.in);
		
		int value;
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(message);
		}
		
		value = sc.nextInt();
		
		return value;
		
		
	}


}
