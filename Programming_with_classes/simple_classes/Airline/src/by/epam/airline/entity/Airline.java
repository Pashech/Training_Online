package by.epam.airline.entity;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:
	
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.time.LocalTime;
import java.util.Comparator;

import by.epam.airline.week.Week;

public class Airline {

	private String destination;
	private int flyghtNumber;
	private String typeOfPlane;
	private LocalTime timeOfDeparture;
	private Week dayOfWeek;

	public Airline() {

	}

	public Airline(String destination, int flyghtNumber, String typeOfPlane, int hour, int minute, Week dayOfWeek) {
		this.destination = destination;
		this.flyghtNumber = flyghtNumber;
		this.typeOfPlane = typeOfPlane;
		this.timeOfDeparture = LocalTime.of(hour, minute);
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlyghtNumber() {
		return flyghtNumber;
	}

	public void setFlyghtNumber(int flyghtNumber) {
		this.flyghtNumber = flyghtNumber;
	}

	public String getTypeOfPlane() {
		return typeOfPlane;
	}

	public void setTypeOfPlane(String typeOfPlane) {
		this.typeOfPlane = typeOfPlane;
	}

	public LocalTime getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(LocalTime timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	public Week getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Week dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flyghtNumber;
		result = prime * result + ((typeOfPlane == null) ? 0 : typeOfPlane.hashCode());
		result = prime * result + ((timeOfDeparture == null) ? 0 : timeOfDeparture.hashCode());
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if(destination == null) {
			if(other.destination != null)
				return false;
		}else if(!destination.equals(other.destination))
			return false;
		if(flyghtNumber != other.flyghtNumber)
			return false;
		if(typeOfPlane == null) {
			if(other.typeOfPlane != null)
				return false;
		}else if(!typeOfPlane.equals(typeOfPlane))
			return false;
		if(timeOfDeparture == null) {
			if(other.timeOfDeparture != null)
				return false;
		}else if(!timeOfDeparture.equals(other.timeOfDeparture))
			return false;
		if(dayOfWeek != other.dayOfWeek)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination= " + destination + ", flyghtNumber= " + flyghtNumber + ", typeOfPlane= " + typeOfPlane
				+ ", timeOfDeparture= " + timeOfDeparture + ", dayOfWeek= " + dayOfWeek + "]";
	}

	

	
	
}
