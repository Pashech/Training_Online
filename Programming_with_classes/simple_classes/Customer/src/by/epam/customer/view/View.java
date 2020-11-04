package by.epam.customer.view;

import java.util.List;
import java.util.Scanner;

import by.epam.customer.entity.Customer;
import by.epam.customer.entity.ListOfCustomers;

public class View {

	public ListOfCustomers listOfCustomer(ListOfCustomers list) {

		ListOfCustomers listCustomer = new ListOfCustomers();

		if (list.getCustomers() != null) {

			listCustomer.addCustomer(new Customer(1, "Sidorov", "Leonid", "Alekseevich", "Kozhara 75",
					8564732099753620L, 23534546437756858L));
			listCustomer.addCustomer(new Customer(2, "Ivanov", "Ivan", "Aleksandrovich", "Sviridova 90",
					4902506725317743L, 63534546937756858L));
			listCustomer.addCustomer(new Customer(3, "Bykov", "Alexander", "Ivanovich", "Sovetskaya 31",
					1900356289640098L, 53533546939756350L));
			listCustomer.addCustomer(new Customer(4, "Dmitriev ", "Dmitry", "Dmitrievich", "Byhovskaya 12",
					5789361209647899L, 15643546939756350L));

		} else {
			System.out.println("List is empty");
		}

		return listCustomer;

	}

	public void displayListOfCustomers(ListOfCustomers list) {

		for (Customer customer : list.getCustomers()) {
			System.out.println(customer);
		}
	}

	public void listOfCustomersSortedByAlphabet(ListOfCustomers list) {

		System.out.println("//============================================================================//");

		System.out.println("List of customers is sorted by alphabet: \n");

		for (Customer customer : list.getCustomers()) {
			System.out.println(customer.getSurname() + " " + customer.getName() + " " + customer.getPatronym());
		}
		System.out.println();
	}

	public void showCustomersByIntervalCards(ListOfCustomers list) {

		System.out.println("//==============================================================================//");

		System.out.println(
				"List of customers credit card numbers list of customers whose credit card number is in the specified interval: ");

		for (Customer customer : list.getCustomers()) {
			System.out.println(customer.getSurname() + " " + customer.getName() + " " + customer.getPatronym());
		}
		System.out.println();
	}

	public static long enterNumber() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of credit card");

		long value;

		value = scan.nextLong();

		return value;
	}

}
