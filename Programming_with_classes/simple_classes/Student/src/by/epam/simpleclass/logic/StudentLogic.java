package by.epam.simpleclass.logic;

import by.epam.simpleclass.entity.Student;

public class StudentLogic {

	Student[] students;

	public void choose(Student[] student) {

		for (int i = 0; i < student.length; i++) {
			int[] mass = student[i].getProgress();
			int count = 0;

			for (int j = 0; j < mass.length; j++) {

				if (mass[j] == 9 || mass[j] == 10) {
					count++;
				}

				if (count == 5) {
					System.out.println(student[i].getName() + " " + student[i].getGroupNumber());
				}

			}

		}
	}

}
