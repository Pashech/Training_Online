package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
Сколько таких действий надо произвести, чтобы получился нуль? 
Для решения задачи использовать декомпозицию*/

public class Task_17 {

	public static void main(String[] args) {
		int number;
		int stepCounter;
		
		number = Input.enterInt("Введите число: ");
		
		stepCounter = count(number);
		
		System.out.println(stepCounter);
		
	}
	
	
	static int count(int number) {
		int count = 0;
		while(number != 0) {
			if(number > 0) {
				number = number - sumNumber(number);
			}
			count++;
		}
		
		return count;
	}
	
	
	
	static int sumNumber(int number) {
		int sum = 0;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
			
		}
		return sum;
	}

}
