package by.epam.Test_2.main;

public class Main {

	public static void main(String[] args) {

		Test_2 test = new Test_2();

		System.out.println("Значения по умолчанию\n");

		System.out.println("First number: " + test.getFirstNumber());
		System.out.println("Second number: " + test.getSecondNumber() + "\n");

		System.out.println("Значения после инициализации\n");

		Test_2 test2 = new Test_2(10, 20);

		System.out.println("First number: " + test2.getFirstNumber());
		System.out.println("Second number: " + test2.getSecondNumber());

	}

}
