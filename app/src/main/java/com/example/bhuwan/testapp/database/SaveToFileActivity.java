package com.example.bhuwan.testapp.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bhuwan.testapp.R;

import org.w3c.dom.Text;

public class SaveToFileActivity extends AppCompatActivity {

    EditText infoToSave;
    TextView displayInfoTextView;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_to_file);

        System.out.println("iside oncreateeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee.............................");

        infoToSave = (EditText) findViewById(R.id.infoToSave);
        displayInfoTextView = (TextView) findViewById(R.id.displayInfoTextView);
        dbHandler = new DBHandler(this, null,null, 1);
        printDatabase();
    }

    private void printDatabase() {

        String dbResult = dbHandler.find();
        displayInfoTextView.setText(dbResult);
        infoToSave.setText("");
    }

    public void deleteFromFile(View view) {
        dbHandler.delete(infoToSave.getText().toString());
        printDatabase();
    }

    public void addToFile(View view) {
        Book book = new Book(infoToSave.getText().toString());
        dbHandler.add(book);
        printDatabase();
    }
}
