package by.epam.airline.view;

import by.epam.airline.entity.Airline;
import by.epam.airline.entity.Airport;
import by.epam.airline.week.Week;

public class AirlineView {
	
	public Airport listOfAirlines(Airport airport) {
		
		Airport listOfAirlines = new Airport();
		
		listOfAirlines.addAirline(new Airline("Madrid", 8249, "Boeing 737-300", 12, 00, Week.MONDAY));
		listOfAirlines.addAirline(new Airline("New-York", 6347, "Boeing 747-800", 15, 10, Week.FRIDAY));
		listOfAirlines.addAirline(new Airline("Paris", 9472, "Airbus A-320", 05, 25, Week.SUNDAY));
		listOfAirlines.addAirline(new Airline("London", 1379, "Boeing 737-300", 10, 40, Week.MONDAY));
		listOfAirlines.addAirline(new Airline("Dubai", 7390, "Airbus A-380", 22, 30, Week.THURSDAY));
		listOfAirlines.addAirline(new Airline("Madrid", 8238, "Boeing 737-300", 17, 00, Week.MONDAY));
		
		return listOfAirlines;
		
	}
	
	public void showAirlines(Airport listOfAirlines) {
		
		for(Airline airline : listOfAirlines.getAirlineList()) {
			
			System.out.println(airline);
		}
	}
	
	public void showListOfFlyghtByDestination(Airport list) {
		
		for(Airline airline : list.getAirlineList()) {
			System.out.println(airline);
		}
	}
	
	public void showListOfFlyghtsByDayOfWeek(Airport list) {
		
		for(Airline airline : list.getAirlineList()) {
			System.out.println(airline);
		}
	}
	
	public void showListOfDayAndAfterSpecifiedTime(Airport list) {
		
		for(Airline airline : list.getAirlineList()) {
			System.out.println(airline);
		}
	}

}
