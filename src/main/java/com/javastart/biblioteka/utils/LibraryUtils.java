package com.javastart.biblioteka.utils;

import com.javastart.biblioteka.data.*;

import java.util.*;

public class LibraryUtils {
    public static void printBooks(Library lib) {
        //ZMIANA
        List<Publication> publications = new ArrayList<>();
        publications.addAll(lib.getPublications().values());
        //DODANE
        Collections.sort(publications, new Library.AlphabeticalComparator());
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

    public static void printMagazines(Library lib) {
        //ZMIANA
        List<Publication> publications = new ArrayList<>();
        publications.addAll(lib.getPublications().values());
        //DODANE
        Collections.sort(publications, new Library.AlphabeticalComparator());
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

    public static void printUsers(Library lib) {
        //ZMIANA
        List<LibraryUser> users = new ArrayList<>();
        users.addAll(lib.getUsers().values());
        //DODANE
        Collections.sort(users, new Comparator<LibraryUser>() {
            @Override
            public int compare(LibraryUser o1, LibraryUser o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for (LibraryUser u : users) {
            System.out.println(u);
        }
    }
}
