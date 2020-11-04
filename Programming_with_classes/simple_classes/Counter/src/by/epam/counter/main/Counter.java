package by.epam.counter.main;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
Написать код, демонстрирующий все возможности класса*/

public class Counter {

	private int min;
	private int max;
	private int currentValue;

	public Counter() {

	}

	public Counter(int min, int max) {

		this.min = min;
		this.max = max;

		if (min > max) {
			this.currentValue = max;
		} else {
			this.currentValue = min;
		}

	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMin() {
		return min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMax() {
		return max;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void increaseValue() {
		if (currentValue + 1 <= max) {
			currentValue++;
		} else {
			System.out.println("Превышено максимальное значение, счетчик сбрасывается на минимальное значение");
			currentValue = min;
		}
	}

	public void decreaseValue() {
		if (currentValue - 1 >= min) {
			currentValue--;
		} else {
			System.out.println("Значение ниже минимального, счетчик сбрасывается на минимальное значение");
			currentValue = min;
		}
	}

	public void showCounter() {
		System.out.println(this.getCurrentValue());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentValue;
		result = prime * result + max;
		result = prime * result + min;
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
		Counter other = (Counter) obj;
		if (currentValue != other.currentValue)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [min=" + min + ", max=" + max + ", currentValue=" + currentValue + "]";
	}

}
