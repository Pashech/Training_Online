package by.epam.multidimensional_array.main;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	
	1  2   3   .... n
	n  n-1 n-2 .... n
	1  2   3   .... n
	n  n-1 n-2 .... n
	.................
	n  n-1 n-2 .... n*/

public class Task_04 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mass = new int[n][n];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {

				if (i % 2 == 0) {
					mass[i][j] = j + 1;
					System.out.print(mass[i][j] + " ");

				} else {
					mass[i][j] = mass.length - j;
					System.out.print(mass[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
