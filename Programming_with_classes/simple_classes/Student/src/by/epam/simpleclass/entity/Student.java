package by.epam.simpleclass.entity;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
Создайте массив из десяти элементов такого типа. 
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

import java.util.Arrays;

public class Student {

	private String name;
	private String groupNumber;
	private static final int numberOfRating = 5;
	private int[] progress = new int[numberOfRating];

	public Student() {

	}
	
	public Student(String name, String groupNumber) {
		this.name = name;
		this.groupNumber = groupNumber;
	}

	public Student(String name, String groupNumber, int[] progress) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.progress = progress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}

	public String getName() {
		return name;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public int[] getProgress() {
		return progress;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", groupNumber=" + groupNumber + ", progress=" + Arrays.toString(progress)
				+ "]";
	}
	
	

}
