package by.epam.airline.main;

import java.time.LocalTime;

import by.epam.airline.entity.Airport;
import by.epam.airline.input.UserInput;
import by.epam.airline.logic.AirlineLogic;
import by.epam.airline.view.AirlineView;
import by.epam.airline.week.Week;

public class Main {

	public static void main(String[] args) {

		Airport airport = new Airport();
		Airport selectedFlights = new Airport();
		AirlineView view = new AirlineView();
		UserInput input = new UserInput();
		AirlineLogic logic = new AirlineLogic();

		airport = view.listOfAirlines(airport);
		view.showAirlines(airport);

		String cityOfDestination;
		cityOfDestination = input.userInput("Enter destination: ");

		selectedFlights = logic.listOfFlightsByDestination(airport, cityOfDestination);
		view.showListOfFlyghtByDestination(selectedFlights);

		String dayOfWeek;
		dayOfWeek = input.userInput("Enter dayOfWeek");
		Week week = Week.valueOf(dayOfWeek.toUpperCase());

		selectedFlights = logic.listOfFlyghtsByDayOfWeek(airport, week);
		view.showListOfFlyghtsByDayOfWeek(selectedFlights);

		dayOfWeek = input.userInput("Enter dayOfWeek");
		week = Week.valueOf(dayOfWeek.toUpperCase());

		int hour;
		int minute;

		hour = input.userInputInt("Enter hour: ");
		minute = input.userInputInt("Enter minutes: ");

		LocalTime specifiedTime = LocalTime.of(hour, minute);

		selectedFlights = logic.listTime(airport, week, specifiedTime);

		view.showListOfDayAndAfterSpecifiedTime(selectedFlights);

	}

}
