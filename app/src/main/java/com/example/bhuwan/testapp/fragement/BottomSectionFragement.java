package com.example.bhuwan.testapp.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bhuwan.testapp.R;

/**
 * Created by bhuwan on 7/29/16.
 */
public class BottomSectionFragement extends Fragment {

    private TextView bottomTopMemeText;
    private TextView bottomBottomMemeText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragement, container, Boolean.FALSE);

        bottomTopMemeText = (TextView) view.findViewById(R.id.bottomTopMemeText);
        bottomBottomMemeText = (TextView) view.findViewById(R.id.bottomBottomMemeText);

        return view;
    }

    public void setMemeText(String top, String bottom){
        bottomTopMemeText.setText(top);
        bottomBottomMemeText.setText(bottom);
    }
}
