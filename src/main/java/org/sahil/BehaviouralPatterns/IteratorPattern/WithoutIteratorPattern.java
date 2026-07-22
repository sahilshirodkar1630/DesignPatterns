package org.sahil.BehaviouralPatterns.IteratorPattern;

import java.util.Iterator;

public class WithoutIteratorPattern {
    public static void main(String[] args) {
        BookCollectionV1 collection = new BookCollectionV1();
        collection.addBook(new Book("Java Book"));
        collection.addBook(new Book("Python Book"));
        collection.addBook(new Book("C++ Book"));

        for(Book book: collection.getBooks()){
            System.out.println(book);
        }

        BookTreeSetCollection collection1 = new BookTreeSetCollection();
        collection1.addBook(new Book("Java Book"));
        collection1.addBook(new Book("Python Book"));
        collection1.addBook(new Book("C++ Book"));

        Iterator<Book> iterator = collection1.iterator();

        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }

    }
}
