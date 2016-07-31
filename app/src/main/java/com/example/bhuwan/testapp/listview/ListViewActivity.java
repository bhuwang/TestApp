package com.example.bhuwan.testapp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.bhuwan.testapp.R;

import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        List<String> companies = Arrays.asList("Google", "Facebook", "Ali Baba", "Amazon", "Apple", "Oracle", "Microsoft", "Yahoo", "eBay","Leapfrog","Deerwalk","Verisk","SPI","Rosebay","SAL");
        ListAdapter companyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, companies);

        ListView companyListView = (ListView) findViewById(R.id.companyListView);
        companyListView.setAdapter(companyAdapter);

        companyListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                String food = parent.getItemAtPosition(position).toString();
                Toast.makeText(ListViewActivity.this, food, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
