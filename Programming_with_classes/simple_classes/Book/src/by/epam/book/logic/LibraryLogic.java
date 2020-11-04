package by.epam.book.logic;

import by.epam.book.entity.Book;
import by.epam.book.entity.Library;

public class LibraryLogic {
	
	public Library searchOfBookByAuthor(Library library, String author) {
		
		Library selecedtLibrary = new Library();
		
		for(Book book : library.getList()) {
			if(book.getAuthor().equals(author)) {
				selecedtLibrary.add(book);
			}
		}
		
		return selecedtLibrary;
	}
	
	public Library searchOfBookByPublishingHouse(Library library, String publishingHouse) {
		
		Library selectedPublish = new Library();
		
		for(Book book : library.getList()) {
			if(book.getPublishingHouse().equals(publishingHouse)) {
				selectedPublish.add(book);
			}
		}
		
		return selectedPublish;
	}
	
	public Library searchOfBookByDate(Library library, int date) {
		
		Library selectedDate = new Library();
		
		for(Book book : library.getList()) {
			if(book.getPublicationDate() > date) {
				selectedDate.add(book);
			}
		}
		
		return selectedDate;
	}

}
