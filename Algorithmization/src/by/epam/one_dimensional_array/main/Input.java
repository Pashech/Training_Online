package by.epam.one_dimensional_array.main;

import java.util.Random;
import java.util.Scanner;

public class Input {
	
	public static int enterInt(String message) {
		
		int value;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		
		value = sc.nextInt();
		
		return value;
	}
	
	
	public static void initArray(int[] mass) {
		
		if(mass == null) {
			return;
		}
		
		Random rand = new Random();
		System.out.println("Original array: ");
		for(int i = 0; i < mass.length; i++) {
			mass[i] = rand.nextInt(100);
			System.out.print(mass[i] + " ");
		}
		System.out.println();
	}

}
