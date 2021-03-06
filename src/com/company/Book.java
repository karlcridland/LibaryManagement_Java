package com.company;
import org.json.simple.JSONObject;

import java.util.Date;

public class Book {

    public String title, author;
    public boolean read;

    private Date started,finished;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }

    void finished(){
        this.read = true;
    }

    // Returns a json object fit for saving with all information given about the book.

    JSONObject jsonObject(){
        return new JSONObject();
    }

}
