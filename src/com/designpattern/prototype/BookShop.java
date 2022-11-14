package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String name;
    private List<Book> books = new ArrayList<>();

    public BookShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {
        for (int i = 1; i <= 20; i++) {
            Book b = new Book("title-" + i, "author-" + i);
            books.add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop("");

        for (Book book : this.getBooks()) {
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }
}
