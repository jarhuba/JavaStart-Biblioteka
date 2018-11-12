package com.javastart.biblioteka.app;

import com.javastart.biblioteka.data.Book;
import com.javastart.biblioteka.data.Library;
import com.javastart.biblioteka.data.Magazine;
import com.javastart.biblioteka.utils.DataReader;
import com.javastart.biblioteka.utils.LibraryUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class LibraryControl {

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

        Option option = null;
        while (option != Option.EXIT) {
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());
                switch (option) {
                    case ADD_BOOK:
                        addBook();
                        break;
                    case ADD_MAGAZINE:
                        addMagazine();
                        break;
                    case PRINT_BOOKS:
                        printBooks();
                        break;
                    case PRINT_MAGAZINES:
                        printMagazines();
                        break;
                    case EXIT:
                        ;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
            }
        }
// zamykamy strumień wejścia
        dataReader.close();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Option o : Option.values()) {
            System.out.println(o);
        }
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printBooks() {
        LibraryUtils.printBooks(library);
    }

    private void printMagazines() {
        LibraryUtils.printMagazines(library);
    }
}
