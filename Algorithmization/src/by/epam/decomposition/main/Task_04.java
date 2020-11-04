package by.epam.decomposition.main;

import java.util.Arrays;

/*На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое
большое расстояние. Указание. Координаты точек занести в массив*/

public class Task_04 {

	public static void main(String[] args) {

		int[][] mass = { { 1, 3 }, { 2, 2 }, { 6, 1 }, { 0, 5 }, };
		int[] points = max(mass);

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Наибольшая дистанция между " + Arrays.toString(mass[points[0]]) + " и "
				+ Arrays.toString(mass[points[1]]));

	}

	private static int[] max(int[][] array) {
		double maxL = 0;
		double length;
		int[] rooms = new int[2];

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				length = distance(array[i][0], array[i][1], array[j][0], array[j][1]);
				if (length > maxL) {
					maxL = length;
					rooms[0] = i;
					rooms[1] = j;
				}
			}
		}
		return rooms;
	}

	static double distance(int x1, int y1, int x2, int y2) {
		double dist;
		dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return dist;
	}

}
