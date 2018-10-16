package com.javastart.biblioteka.app;

import com.javastart.biblioteka.data.Book;
import com.javastart.biblioteka.data.Library;
import com.javastart.biblioteka.utils.DataReader;

public class LibraryControl {

    // zmienne do kontrolowania programu
    public final int exit = 0;
    public final int addBook = 1;
    public final int printBooks = 2;

    // zmienna do komunikacji z użytkownikiem
    private DataReader dataReader;

    // "biblioteka" przechowująca dane
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    /*
     * Główna pętla programu, która poawala na wybór programu i interakcję
     */
    public void controlLoop() {
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != exit) {
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
            printOptions();
        }
// zamykamy strumień wejścia
        dataReader.close();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }
}
