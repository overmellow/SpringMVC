package com.wv.mfaraji.spring.mvc;

import java.util.Collection;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}