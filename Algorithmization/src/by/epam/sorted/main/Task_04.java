package by.epam.sorted.main;

/*Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai, a(i+1). Если ai > ai+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/

public class Task_04 {

	public static void main(String[] args) {
		
		int[] mass = {100, 10 , 12, 15, 80};
		int count = 0;
		
		System.out.println("Изначальный массив: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			
			for (int j = 0; j < mass.length - 1; j++) {
				if(mass[j] > mass[j + 1]) {
					int temp = mass[j + 1];
					mass[j + 1] = mass[j];
					mass[j] = temp;
					count++;
				}
					
			}
			
		}
		System.out.println("\n" + "Отсортированный массив: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		
		System.out.println("\n" + "Количество перестановок: " + count);
		

	}

}
