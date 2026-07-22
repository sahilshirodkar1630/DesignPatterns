package org.sahil.BehaviouralPatterns.IteratorPattern;

import java.util.*;

public class BookTreeSetCollection implements Iterable<Book> {

    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

}
