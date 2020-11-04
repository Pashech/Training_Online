package by.epam.customer.logic;

import java.util.Comparator;

import by.epam.customer.entity.Customer;

public class NamesCustomersComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getSurname().compareTo(o2.getSurname());
	}
	
	

}
