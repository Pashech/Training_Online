package by.epam.customer.main;

import by.epam.customer.entity.ListOfCustomers;
import by.epam.customer.logic.Logic;
import by.epam.customer.view.View;

public class Main {

	public static void main(String[] args) {

		View view = new View();
		Logic logic = new Logic();

		ListOfCustomers list = new ListOfCustomers();
		
		ListOfCustomers listOfCustomers;

		listOfCustomers = view.listOfCustomer(list);
		view.displayListOfCustomers(listOfCustomers);

		listOfCustomers = logic.sortedByAlphabet(listOfCustomers);
		view.listOfCustomersSortedByAlphabet(listOfCustomers);

		long firstNumber;
		long secondNumber;

		firstNumber = View.enterNumber();
		secondNumber = View.enterNumber();

		listOfCustomers = logic.intervalOfCreditCard(firstNumber, secondNumber, listOfCustomers);
		view.showCustomersByIntervalCards(listOfCustomers);

	}

}
