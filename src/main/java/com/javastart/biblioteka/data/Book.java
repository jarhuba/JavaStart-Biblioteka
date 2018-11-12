package com.javastart.biblioteka.data;

import java.util.Objects;

public class Book extends Publication {

    private String author;
    private int pages;
    private String isbn;


    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        super(year, title, publisher);
        this.setAuthor(author);
        this.setPages(pages);
        this.setIsbn(isbn);
    }


    @Override
    public String toString() {
        StringBuilder print = new StringBuilder(32);
        print.append(getTitle());
        print.append("; ");
        print.append(getAuthor());
        print.append("; ");
        print.append(getYear());
        print.append("; ");
        print.append(getPages());
        print.append("; ");
        print.append(getPublisher());
        print.append("; ");
        print.append(getIsbn());

        return print.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), author, pages, isbn);
    }
}