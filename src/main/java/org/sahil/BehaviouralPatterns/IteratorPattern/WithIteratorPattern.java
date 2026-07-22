package org.sahil.BehaviouralPatterns.IteratorPattern;

import java.util.Iterator;

public class WithIteratorPattern {
    public static void main(String[] args) {
        BookListCollection collection = new BookListCollection();
        collection.addBook(new Book("Java Book"));
        collection.addBook(new Book("Python Book"));
        collection.addBook(new Book("C++ Book"));

        Iterator<Book> iterator = collection.createIterator();

        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println("Book Title "+ book.getTitle());
        }

    }
}
