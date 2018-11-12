package com.javastart.biblioteka.data;

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

    public Book(Book book) {
        this(book.getTitle(), book.getAuthor(), book.getYear(), book.getPages(), book
                .getPublisher(), book.getIsbn());
    }

    public void printInfo() {
        String info = "Tytuł: " + getTitle() + "; Autor: " + getAuthor() + "; Release Year: " + getYear() + "; Pages: " + getPages()
                + "; Publisher: " + getPublisher() + "; ISBN: " + getIsbn();
        System.out.println(info);
    }
}
