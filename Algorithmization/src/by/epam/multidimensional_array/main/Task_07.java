package by.epam.multidimensional_array.main;

/*
  Сформировать квадратную матрицу порядка N по правилу:
  A[I,J] = sin((I² - J²) / N)
  и подсчитать количество положительных элементов в ней*/
 

public class Task_07 {
	
	public static int PositiveNumber(double[][] mass) {
		int count = 0;
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				if(mass[i][j] >= 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		int n = 5;
		
		double[][] mass = new double[n][n];
		
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				mass[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				System.out.print(mass[i][j] + " \t");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("количество положительных чисел = " + PositiveNumber(mass));
	}

}
