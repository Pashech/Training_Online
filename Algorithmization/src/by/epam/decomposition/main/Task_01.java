package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/* Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 натуральных чисел:
 HOK(A,B) = (A*B)/ НОД(A,B)
  */

public class Task_01 {

	

	public static void main(String[] args) {
		int a;
		int b;
		
		a = Input.enterInt("Введите a: ");
		b = Input.enterInt("Введите b: ");
		
		System.out.println(Nok(a, b));
	}
	
	public static int Nod(int a, int b) {

		for (int i = (a > b ? b : a); i > 1; i--) {
			
			if (a % i == 0 && b % i == 0) {
				return i;
			}
			
		}
		return 0;
	}
	
	public static int Nok(int a, int b) {
		int nok;
		
		nok = (a * b) / Nod(a, b);
		
		return nok;
		
	}

}
