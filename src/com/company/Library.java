package com.company;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Library {

    public static Library shared = new Library();
    private Vector<Book> books = new Vector();
    JSONParser parser = new JSONParser();

    private Library(){
        try{
            JSONArray array = (JSONArray) parser.parse(new FileReader("src/com/company/data/Library.json"));
            for (Object original: array){
                this.append(readObject(original));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void append(Book book){
        books.add(book);
    }

    private Book readObject(Object original){
        JSONObject object = (JSONObject) original;
        Book book = new Book(object.get("title").toString(), object.get("author").toString());
        return book;
    }

    void allBooks(){
        for (Book book: books){
            System.out.println(book.toString());
        }
    }

}
