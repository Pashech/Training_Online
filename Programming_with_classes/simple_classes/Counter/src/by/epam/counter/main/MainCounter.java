package by.epam.counter.main;

public class MainCounter {

	public static void main(String[] args) {

		Counter counter = new Counter(18, 20);

		System.out.println(counter.toString());
		counter.increaseValue();
		counter.showCounter();
		counter.increaseValue();
		counter.showCounter();
		counter.increaseValue();
		counter.showCounter();
		counter.increaseValue();
		counter.showCounter();
		
		counter.decreaseValue();
		counter.showCounter();
		counter.decreaseValue();
		
		counter.showCounter();
		
		
		
		

	}

}
