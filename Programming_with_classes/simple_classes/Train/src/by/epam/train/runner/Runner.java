package by.epam.train.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import by.epam.train.entity.Train;
import by.epam.train.logic.TrainLogic;
import by.epam.train.view.TrainView;

public class Runner {

	public static void main(String[] args) {

		TrainLogic trainLogic = new TrainLogic();
		TrainView trainView = new TrainView();
		Train train = new Train();

		List<Train> trains = new ArrayList<Train>();

		// Выводим список поездов

		trainView.showTrainsByNumber(trains);
		System.out.println();

		System.out.println("Поезда отсортированы по номеру: ");

		trains = trainLogic.sortByNumber(trains);
		System.out.println(trains);
		System.out.println();

		// Просим пользователя ввести номер поезда

		int number = trainView.enteredNumber("Введите номер поезда: ");

		train = trainLogic.findNumber(number, trains);
		trainView.print(train);

		// Сортируем поезда по пункту назначения и по времени отправления

		Comparator<Train> comp = new Train();

		System.out.println("Поезда отсортированы по пункту назначения и времени отправления: ");
		Collections.sort(trains, comp);
		System.out.println(trains);

	}

}
