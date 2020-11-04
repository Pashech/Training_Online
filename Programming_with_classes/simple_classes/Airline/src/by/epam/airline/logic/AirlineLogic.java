package by.epam.airline.logic;

import java.time.LocalTime;
import java.util.Collections;
import java.util.Comparator;

import by.epam.airline.entity.Airline;
import by.epam.airline.entity.Airport;
import by.epam.airline.week.Week;

public class AirlineLogic {

	public Airport listOfFlightsByDestination(Airport list, String city) {

		Airport listOfAirlines = new Airport();

		for (Airline airline : list.getAirlineList()) {
			if (airline.getDestination().equals(city)) {
				listOfAirlines.addAirline(airline);
			}
		}

		return listOfAirlines;
	}

	public Airport listOfFlyghtsByDayOfWeek(Airport list, Week dayOfWeek) {

		Airport listOfAirlines = new Airport();

		for (Airline airline : list.getAirlineList()) {
			if (airline.getDayOfWeek().equals(dayOfWeek)) {
				listOfAirlines.addAirline(airline);
			}
		}

		return listOfAirlines;
	}

	public Airport listTime(Airport list, Week day, LocalTime time) {

		Airport listOfAirlines = listOfFlyghtsByDayOfWeek(list, day);

		Airport air = new Airport();

		for (Airline a : listOfAirlines.getAirlineList()) {
			if (a.getTimeOfDeparture().isAfter(time)) {
				air.addAirline(a);
			}
		}

		return air;
	}

}
