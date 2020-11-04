package by.epam.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class ListOfCustomers {

	private List<Customer> customers = new ArrayList<Customer>();

	public ListOfCustomers() {

	}

	public ListOfCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	
	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}
	
	public void removeCustomer(Customer customer) {
		this.customers.remove(customer);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListOfCustomers other = (ListOfCustomers) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListOfCustomers [customers=" + customers + "]";
	}

}
