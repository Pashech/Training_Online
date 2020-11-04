package by.epam.train.entity;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть
упорядочены по времени отправления.
*/
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Comparator;

public class Train implements Comparator<Train> {

	private String destination;
	private int trainNumber;
	private LocalTime departureTime;

	public Train() {

	}

	public Train(String destination, int trainNumber, int hour, int minute) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = LocalTime.of(hour, minute);
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {
		return "Train [destination= " + destination + ", trainNumber= " + trainNumber + ", departureTime= "
				+ departureTime + "]\n";
	}

	@Override
	public int compare(Train o1, Train o2) {

		int temp = o1.getDestination().compareTo(o2.getDestination());

		if (temp == 0) {
			return o1.getDepartureTime().compareTo(o2.getDepartureTime());
		}

		return temp;
	}
	
	

}
