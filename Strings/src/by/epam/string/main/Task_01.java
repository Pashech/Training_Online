package by.epam.string.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task_01 {

	public static void main(String[] args) {

		String[] mass = { "spartakMoskwa", "realMadrid", "manchesterUnited" };

		for (int i = 0; i < mass.length; i++) {
			mass[i] = substitute(mass[i]);
		}
		System.out.println(Arrays.toString(mass));
	}

	static String substitute(String a) {
		StringBuilder stringBuilder = new StringBuilder();

		char[] mass = a.toCharArray();

		for (char m : mass) {
			if (Character.isUpperCase(m)) {
				stringBuilder.append("_").append(Character.toLowerCase(m));
			}else {
                stringBuilder.append(m);
            }
		}

		return stringBuilder.toString();
	}

}
