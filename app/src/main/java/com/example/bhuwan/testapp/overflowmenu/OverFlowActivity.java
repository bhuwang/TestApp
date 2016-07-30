package com.example.bhuwan.testapp.overflowmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.bhuwan.testapp.R;

import org.w3c.dom.Text;

public class OverFlowActivity extends AppCompatActivity {

    private TextView displayBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_flow);

        displayBoard = (TextView) findViewById(R.id.displayBoard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (item.getItemId()){
            case R.id.facebook:
                displayBoard.setText("Facebook");
                return true;
            case R.id.twitter:
                displayBoard.setText("Twitter");
                return true;
            case R.id.youtube:
                displayBoard.setText("Youtube");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
