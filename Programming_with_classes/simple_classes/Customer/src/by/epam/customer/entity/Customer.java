package by.epam.customer.entity;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

Найти и вывести:
	
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.Comparator;

public class Customer {

	private int ID;
	private String surname;
	private String name;
	private String patronym;
	private String adress;
	private long numberOfCreditCard;
	private long numberOfBankAccount;

	public Customer() {

	}

	public Customer(int ID, String surname, String name, String patronym) {
		this.ID = ID;
		this.surname = surname;
		this.name = name;
		this.patronym = patronym;
	}

	public Customer(int ID, String surname, String name, String patronym, String adress, long numberOfCreditCard,
			long numberOfBankAccaunt) {
		this.ID = ID;
		this.surname = surname;
		this.name = name;
		this.patronym = patronym;
		this.adress = adress;
		this.numberOfCreditCard = numberOfCreditCard;
		this.numberOfBankAccount = numberOfBankAccaunt;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPatronym(String patronym) {
		this.patronym = patronym;
	}

	public String getPatronym() {
		return patronym;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String gerAdress() {
		return adress;
	}

	public void setNumberOfCreditCard(long numberOfCreditCard) {
		this.numberOfCreditCard = numberOfCreditCard;
	}

	public long getNumberOfCreditCard() {
		return numberOfCreditCard;
	}

	public void setNumberOfBankAccount(long numberOfBankAccaunt) {
		this.numberOfBankAccount = numberOfBankAccaunt;
	}
	
	public long getNumberOfBankAccount() {
		return numberOfBankAccount;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (numberOfBankAccount ^ (numberOfBankAccount >>> 32));
		result = prime * result + (int) (numberOfCreditCard ^ (numberOfCreditCard >>> 32));
		result = prime * result + ((patronym == null) ? 0 : patronym.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (ID != other.ID)
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfBankAccount != other.numberOfBankAccount)
			return false;
		if (numberOfCreditCard != other.numberOfCreditCard)
			return false;
		if (patronym == null) {
			if (other.patronym != null)
				return false;
		} else if (!patronym.equals(other.patronym))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", surname=" + surname + ", name=" + name + ", patronym=" + patronym + ", adress="
				+ adress + ", numberOfCreditCard=" + numberOfCreditCard + ", numberOfBankAccount=" + numberOfBankAccount
				+ "]\n";
	}

	
	
	
	
	
	

}
