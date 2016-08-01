package com.example.bhuwan.testapp.database;

/**
 * Created by bhuwan on 7/31/16.
 */
public class Book {
    private int id;
    private String name;

    public Book() {
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
