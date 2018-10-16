package com.javastart.biblioteka.data;

public class Library {

    public static final int MAX_BOOKS = 1000;
    private Book[] books;
    private int booksNumber;

    public Library() {
        books = new Book[MAX_BOOKS];
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println(" Maksymalna liczba książek zostałą osiągnięta");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece.");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }
}
