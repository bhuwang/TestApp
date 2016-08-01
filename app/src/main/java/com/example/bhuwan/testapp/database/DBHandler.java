package com.example.bhuwan.testapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bhuwan on 7/31/16.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "book.db";
    private static final String TABLE_BOOK = "book";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE "
                + TABLE_BOOK + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_NAME + " TEXT)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BOOK);
        onCreate(db);
    }

    // Add
    public void add(Book book) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, book.getName());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_BOOK, null, values);
        db.close();
    }

    // Delete
    public void delete(String name) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_BOOK + " WHERE " + COLUMN_NAME + " = '" + name + "'");
        db.close();
    }

    // Find
    public String find() {
        SQLiteDatabase db = getWritableDatabase();

        // cursor point to a location in your results
        Cursor c = db.rawQuery("SELECT * FROM " + TABLE_BOOK, null);

        StringBuilder bookName = new StringBuilder("");
        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                bookName.append(c.getString(c.getColumnIndex("name"))).append("\n");;
            } while (c.moveToNext());
        }

        db.close();
        return bookName.toString();
    }
}

