package com.company;
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
        return String.format(this.title + " by " + this.author);
    }

    void finished(){
        this.read = true;
    }

}
