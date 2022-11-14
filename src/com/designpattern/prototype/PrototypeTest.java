package com.designpattern.prototype;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop1 = new BookShop("bookshop-1");
        bookShop1.loadBooks();
        BookShop bookShop2 = (BookShop) bookShop1.clone();
        bookShop2.setName("bookshop-2");

        bookShop1.getBooks().remove(1);

        System.out.println(bookShop1);
        System.out.println(bookShop2);
    }
}
