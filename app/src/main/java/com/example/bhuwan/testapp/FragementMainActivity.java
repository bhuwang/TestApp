package com.example.bhuwan.testapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bhuwan.testapp.fragement.BottomSectionFragement;
import com.example.bhuwan.testapp.fragement.TopSectionFragement;

public class FragementMainActivity extends AppCompatActivity implements TopSectionFragement.TopSectionFragementListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragement_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
        BottomSectionFragement frag2 =  (BottomSectionFragement) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        frag2.setMemeText(top, bottom);
    }
}
