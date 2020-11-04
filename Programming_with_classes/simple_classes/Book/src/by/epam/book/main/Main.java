package by.epam.book.main;

import by.epam.book.entity.Library;
import by.epam.book.logic.LibraryLogic;
import by.epam.book.view.ViewLibrary;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();
		Library selectedLibrary;
	
		ViewLibrary view = new ViewLibrary();
		view.showLibrary(library);
		
		String author;
		
		author = ViewLibrary.enterAuthor("Enter author: ");
		
		LibraryLogic logic = new LibraryLogic();
		selectedLibrary = logic.searchOfBookByAuthor(library, author);
		view.showBooksOfAuthor(selectedLibrary);
		
		String publishingHouse;
		
		publishingHouse = ViewLibrary.enterPublishingHouse("Enter publishing house: ");
		
		selectedLibrary = logic.searchOfBookByPublishingHouse(library, publishingHouse);
		view.showBooksOfPublishingHouse(selectedLibrary);
		
		int publisherYear;
		
		publisherYear = ViewLibrary.enterPublisherYear("Enter publisher`s year:");
		
		selectedLibrary = logic.searchOfBookByDate(library, publisherYear);
		view.showBooksOfDate(selectedLibrary);
	}

}
