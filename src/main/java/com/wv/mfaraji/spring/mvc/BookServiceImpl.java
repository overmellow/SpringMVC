package com.wv.mfaraji.spring.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

	@Override
	public Collection<Book> getBooks() {
		System.out.println("hey");
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("12321", "War & Peace", "Tolstoy"));
		books.add(new Book("55556", "Darwin and his bears", "Sulloway"));
		books.add(new Book("77888", "The art of war", "Sun Tzu"));
		
		return books;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}
	
}