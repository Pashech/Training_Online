package by.epam.simpleclass.main;

import by.epam.simpleclass.entity.ClassRoom;
import by.epam.simpleclass.entity.Student;
import by.epam.simpleclass.logic.StudentLogic;
import by.epam.simpleclass.view.StudentView;

public class Main {

	public static void main(String[] args) {

		Student[] student = new Student[10];
		Student[] pupils;

		StudentView view = new StudentView();
		StudentLogic logic = new StudentLogic();
		ClassRoom classRoom = new ClassRoom();

		pupils = view.initStudents(student);
		view.show(pupils);
		
		logic.choose(pupils);

	}

}
