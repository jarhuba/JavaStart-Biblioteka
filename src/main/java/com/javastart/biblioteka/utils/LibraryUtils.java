package com.javastart.biblioteka.utils;

import com.javastart.biblioteka.data.*;

import java.util.Arrays;
import java.util.Collection;

public class LibraryUtils {
    //ZMIENIONY TYP I PĘTLA
    public static void printBooks(Library lib) {
        Collection<Publication> publications = lib.getPublications().values();
        int countBooks = 0;
        for (Publication p : publications) {
            if (p instanceof Book) {
                System.out.println(p);
                countBooks++;
            }
        }

        if (countBooks == 0) {
            System.out.println("Brak książek w bibliotece");
        }
    }

    //ZMIENIONY TYP I PĘTLA
    public static void printMagazines(Library lib) {
        Collection<Publication> publications = lib.getPublications().values();
        int countMagazines = 0;
        for (Publication p : publications) {
            if (p instanceof Magazine) {
                System.out.println(p);
                countMagazines++;
            }
        }

        if (countMagazines == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
    }
    //DODANE
    public static void printUsers(Library lib) {
        Collection<LibraryUser> users = lib.getUsers().values();
        for(LibraryUser u : users) {
            System.out.println(u);
        }
    }
}
