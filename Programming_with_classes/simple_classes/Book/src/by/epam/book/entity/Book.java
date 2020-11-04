package by.epam.book.entity;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

public class Book {
	
	private int ID;
	private String title;
	private String author;
	private String publishingHouse;
	private int publicationDate;
	private int numberOfPages;
	private int price;
	private String typeOfBinding;
	
	public Book(){
		
	}

	public Book(int iD, String title, String author, String publishingHouse, int publicationDate, int numberOfPages,
			int price, String typeOfBinding) {
		
		ID = iD;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publicationDate = publicationDate;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typeOfBinding = typeOfBinding;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + numberOfPages;
		result = prime * result + price;
		result = prime * result + publicationDate;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((typeOfBinding == null) ? 0 : typeOfBinding.hashCode());
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
		Book other = (Book) obj;
		if (ID != other.ID)
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (price != other.price)
			return false;
		if (publicationDate != other.publicationDate)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (typeOfBinding == null) {
			if (other.typeOfBinding != null)
				return false;
		} else if (!typeOfBinding.equals(other.typeOfBinding))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [ID=" + ID + ", title=" + title + ", author=" + author + ", publishingHouse=" + publishingHouse
				+ ", publicationDate=" + publicationDate + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", typeOfBinding=" + typeOfBinding + "]";
	}
	
	
	
	

}
