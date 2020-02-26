package com.example.andriod.booklistingapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    private static final String TITTLE_AUTHOR = " By ";

    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }
        Book currentBook = getItem(position);
        String bookTittle = currentBook.getTittle();
        ArrayList<String> authors = currentBook.getAuthors();
        String bookAuthors = authors.get(0);
        for (int i = 1; i < authors.size(); i++) {
            bookAuthors = bookAuthors + ", " + authors.get(i);
        }
        String tittleAndAuthhors = bookTittle + " " + TITTLE_AUTHOR + " " + bookAuthors;

        // Find the TextView with view ID location
        TextView bookView = (TextView) listItemView.findViewById(R.id.text_view);
        bookView.setText(tittleAndAuthhors);
        return listItemView;



    }
}