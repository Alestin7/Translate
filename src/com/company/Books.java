package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Books {
    private List<Book> books;

    public Books(){
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            books.add(Book.generate());
        }
    }

    public void clear(){
        books.clear();
    }

    @Override
    public String toString() {
        return "\n\nBooks{" +
                "books=" + books +
                '}';
    }
}
