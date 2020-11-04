package by.epam.train.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import by.epam.train.entity.Depo;
import by.epam.train.entity.Train;

public class TrainView {

	public List<Train> showTrainsByNumber(List<Train> list) {

		list.add(new Train("Minsk", 8673, 12, 00));
		list.add(new Train("Gomel", 4568, 15, 30));
		list.add(new Train("Minsk", 1295, 9, 00));
		list.add(new Train("Gomel", 7548, 11, 15));
		list.add(new Train("Vitebsk", 4731, 18, 30));

		return list;
	}

	public int enteredNumber(String message) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		number = sc.nextInt();
		return number;

	}
	
	public void print(Train train) {
		System.out.println(train);
	}

}
