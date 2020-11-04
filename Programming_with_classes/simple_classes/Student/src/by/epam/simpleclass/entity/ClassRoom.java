package by.epam.simpleclass.entity;

import java.util.Arrays;

public class ClassRoom {
	
	private Student[] student;
	
	public ClassRoom() {
		
	}

	public ClassRoom(Student[] student) {
		super();
		this.student = student;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "ClassRoom [student=" + Arrays.toString(student) + "]";
	}
	
	

}
