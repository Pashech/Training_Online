package by.epam.simpleclass.view;

import by.epam.simpleclass.entity.Student;

public class StudentView {

	public Student[] initStudents(Student[] students) {

		int[] rating;

		for (int i = 0; i < students.length; i++) {
			rating = new int[5];

			for (int j = 0; j < rating.length; j++) {
				rating[j] = (int) Math.round(Math.random() * 2 + 8);

			}

			students[i] = new Student("Student " + i, "TD-11", rating);
		}

		return students;
	}

	public void show(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}

}
