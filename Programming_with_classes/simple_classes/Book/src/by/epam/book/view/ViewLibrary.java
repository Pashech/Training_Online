package by.epam.book.view;

import by.epam.book.entity.Book;
import by.epam.book.entity.Library;
import java.util.Scanner;

public class ViewLibrary {

	public void showLibrary(Library list) {
		
		list.add(new Book(1, "Warcraft", "Metzen", "Blizzard", 2017, 1050, 2389, "hard"));
		list.add(new Book(2, "War and peace", "Tolstoy", "Art house", 1932, 5463, 1500, "hard"));
		list.add(new Book(3, "Froze throne", "Metzen", "Blizzard", 2011, 593, 740, "soft"));
		list.add(new Book(4, "Pinoccio", "Radari", "Italian house", 1968, 488, 362, "soft"));
		
		System.out.println("List of books: \n");
		
		for(Book book : list.getList()) {
			System.out.println(book);
		}
		
		System.out.println();
	}
	
	
	public void showBooksOfAuthor(Library selectedLibrary) {
		
		System.out.println("List of books by a given author:");
		
		for(Book book : selectedLibrary.getList()) {
			System.out.println(book.getTitle());
		}
		System.out.println();
	}
	
	public void showBooksOfPublishingHouse(Library selectPublish) {
		
		System.out.println("The list of books given authorspeak of books published by a given publisher:");
		
		for(Book book : selectPublish.getList()) {
			System.out.println(book.getTitle());
		}
		System.out.println();
	}
	
	public void showBooksOfDate(Library library) {
		
		System.out.println("List of books released after the specified year:");
		
		for(Book book : library.getList()) {
			System.out.println(book.getTitle());
		}
		
		System.out.println();
	}
	
	public static String enterAuthor(String message) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		String author = null;
		
		while(!sc.hasNextLine()) {
			sc.next();
		}
		
		author = sc.nextLine();
		
		return author;
	}
	
	
	public static String enterPublishingHouse(String message) {
		String publishingHouse = null;
		
		publishingHouse = enterAuthor(message);
		
		return publishingHouse;
	}
	
	public static int enterPublisherYear(String message) {
		
		System.out.println("Enter publisher`s year:");
		
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		
		year = sc.nextInt();
		
		return year;
	}
	
		

}
