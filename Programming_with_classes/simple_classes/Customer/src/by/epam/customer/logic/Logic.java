package by.epam.customer.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.customer.entity.Customer;
import by.epam.customer.entity.ListOfCustomers;

public class Logic {
	
	public ListOfCustomers sortedByAlphabet(ListOfCustomers list) {
		
		Comparator comp = new NamesCustomersComparator();
		Collections.sort(list.getCustomers(), comp);
		
		return list;
	}
	
	public ListOfCustomers intervalOfCreditCard(long firstNumber, long secondNumber, ListOfCustomers list) {
		
		ListOfCustomers listCustomers = new ListOfCustomers();
		
		for(Customer customer : list.getCustomers()) {
			if(customer.getNumberOfCreditCard() >= firstNumber && customer.getNumberOfCreditCard() <= secondNumber) {
				listCustomers.addCustomer(customer);
			}
		}
		
		return listCustomers;
	}
	

	}
