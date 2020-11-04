package by.epam.train.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.train.entity.Train;

public class TrainLogic {

	public List<Train> sortByNumber(List<Train> trains) {

		for (int i = 0; i < trains.size(); i++) {
			for (int j = 0; j < trains.size(); j++) {
				if (trains.get(i).getTrainNumber() < trains.get(j).getTrainNumber()) {
					Train temp = trains.get(i);
					trains.set(i, trains.get(j));
					trains.set(j, temp);
				}
			}

		}

		return trains;
	}

	public Train findNumber(int findNumber, List<Train> list) {

		Train train = null;

		for (int i = 0; i < list.size(); i++) {
			if (findNumber == list.get(i).getTrainNumber()) {
				train = list.get(i);

			}
		}

		return train;
	}

}
