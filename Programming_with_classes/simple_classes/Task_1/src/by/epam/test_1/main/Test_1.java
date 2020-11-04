package by.epam.test_1.main;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
*/
public class Test_1 {

	private int a;
	private int b;

	public Test_1() {

	}

	public Test_1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void print() {
		System.out.println("First number: " + a + "\n" + "Second number: " + b);
	}

	public void sum() {
		int sum = a + b;
		System.out.println("Sum (a + b) is: " + sum);
	}

	public void max() {
		int max = a > b ? a : b;
		System.out.println("Max number is: " + max);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test_1 other = (Test_1) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;

	}

}
