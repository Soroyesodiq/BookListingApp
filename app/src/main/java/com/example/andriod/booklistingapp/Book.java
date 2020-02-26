package com.example.andriod.booklistingapp;

import java.util.ArrayList;

public class Book {
    private String mTittle;
    private ArrayList<String> mAuthors;

    public Book(String tittle, ArrayList<String> authors)  {
        mTittle = tittle;
        mAuthors = authors;
    }

    public String getTittle() {
        return mTittle;
    }

    public ArrayList<String> getAuthors() {
        return mAuthors;
    }
}
