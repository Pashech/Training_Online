package by.epam.multidimensional_array.main;

import java.util.Arrays;
import java.util.Scanner;

import by.epam.sorted.main.Fraction;

public class Test {

	public static void main(String[] args) {

		  int firstColumn = input("first");
	        int secondColumn = input("second");

	        int[][] matrix = {{1, 2, 3, 4, 5},
	                          {1, 2, 3, 4, 5},
	                          {1, 2, 3, 4, 5},
	                          {1, 2, 3, 4, 5},
	                          {1, 2, 3, 4, 5}};

	        if (firstColumn >= matrix[0].length || secondColumn >= matrix[0].length ||
	                firstColumn < 0 || secondColumn < 0) {
	            System.out.println("Замена невозможна");

	        } else {
	            for (int j = 0; j < matrix.length; j++) {
	                for (int i = 0; i < matrix.length; i++) {
	                    int temp = matrix[i][firstColumn - 1];
	                    matrix[i][firstColumn - 1] = matrix[i][secondColumn - 1];
	                    matrix[i][secondColumn - 1] = temp;
	                }
	            }
	            for (int i = 0; i < matrix.length; i++, System.out.println()) {
	                for (int j = 0; j < matrix.length; j++) {
	                    System.out.print(matrix[i][j] + " ");
	                }
	            }
	        }
	    }

	    private static int input(String column) {
	        System.out.print("Enter " +column+ " column: ");
	        return new Scanner(System.in).nextInt();
	    }
	}
