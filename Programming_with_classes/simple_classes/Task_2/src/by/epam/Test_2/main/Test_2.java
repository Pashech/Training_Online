package by.epam.Test_2.main;

/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
Добавьте конструктор, инициализирующий члены класса по умолчанию. 
Добавьте set- и get- методы для полей экземпляра класса.
*/
public class Test_2 {
	
	private int firstNumber;
	private int secondNumber;
	
	public Test_2() {
		
	}
	
	public Test_2(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void secondNumber(int secondNimber) {
		this.secondNumber = secondNimber;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}
	
	public int getSecondNumber() {
		return secondNumber;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstNumber;
		result = prime * result + secondNumber;
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Test_2 other = (Test_2)obj;
		if(firstNumber != other.firstNumber)
			return false;
		if(secondNumber != other.secondNumber)
			return false;
		return true;
	}

}
