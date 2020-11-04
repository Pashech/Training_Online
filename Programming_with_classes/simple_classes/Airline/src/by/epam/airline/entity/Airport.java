package by.epam.airline.entity;

import java.util.List;
import java.util.ArrayList;

public class Airport {

	private List<Airline> airlineList = new ArrayList<Airline>();

	public Airport() {

	}

	public Airport(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}

	public void setAirlineList(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}

	public List<Airline> getAirlineList() {
		return airlineList;
	}

	public void addAirline(Airline airline) {
		this.airlineList.add(airline);
	}

	public void removeAirline(Airline airline) {
		this.airlineList.remove(airline);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineList == null) ? 0 : airlineList.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != getClass())
			return false;
		Airport other = (Airport) obj;
		if (airlineList == null) {
			if (other.airlineList != null)
				return false;
		} else if (!airlineList.equals(other.airlineList))
			return false;
		return true;

	}

	@Override
	public String toString() {
		return "Airport [airlineList=" + airlineList + "]";
	}
	
	

}
