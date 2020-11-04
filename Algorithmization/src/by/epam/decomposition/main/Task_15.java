package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию.
*/
public class Task_15 {

	public static void main(String[] args) {
		int value;
		
		value = Input.enterInt("Введите число: ");
		
		numbers(value);

	}

	static void numbers(int n) {
		int mass[] = new int[n];
		mass[0] = 1;
		
		while (mass[n - 1] < 9) {
			
			for (int i = 1; i < mass.length; i++) {
				mass[i] = mass[0] + i;
			}

			 for(int i = 0; i < mass.length; i++) {
				 System.out.print(mass[i]);
			 }
	            System.out.print(" ");
	            mass[0]++;
		}
	}
}
