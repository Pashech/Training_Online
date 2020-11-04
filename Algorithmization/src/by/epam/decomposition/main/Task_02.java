package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task_02 {
	
	

	public static void main(String[] args) {
		int a;
		int b;
		
		a = Input.enterInt("Введите a: ");
		b = Input.enterInt("Введите b: ");
		
		System.out.println(Nod(a, b));

	}
	
public static int Nod(int a, int b){
		
		for(int i = (a > b ? b : a); i > 1; i--) {
			if(a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 0;
	}

}
