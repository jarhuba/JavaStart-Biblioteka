package com.javastart.biblioteka.app;

import com.javastart.biblioteka.data.Book;
import com.javastart.biblioteka.utils.DataReader;

public class LibraryApp {

    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
