package com.javastart.biblioteka.data;

public class Book {

    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book(Book book) {
        this(book.getTitle(), book.getAuthor(), book.getReleaseDate(), book.getPages(), book
                .getPublisher(), book.getIsbn());
    }

    public void printInfo() {
        String info = "Tytuł: " + getTitle() + "; Autor: " + getAuthor() + "; Release Date: " + getReleaseDate() + "; Pages: " + getPages()
                + "; Publisher: " + getPublisher() + "; ISBN: " + getIsbn();
        System.out.println(info);
    }
}
