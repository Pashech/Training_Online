package by.epam.train.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Depo  {

	List<Train> trains = new ArrayList<Train>();

	public Depo() {

	}

	public Depo(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(Train train) {
		trains.add(train);
	}
	
	public void add(Train train) {
		this.trains.add(train);
	}

	@Override
	public String toString() {
		return "Depo [trains=" + trains + "]";
	}

}
