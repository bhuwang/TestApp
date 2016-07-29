package com.example.bhuwan.testapp.fragement;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bhuwan.testapp.R;

/**
 * Created by bhuwan on 7/29/16.
 */
public class TopSectionFragement extends Fragment {

    private static EditText topMemeText;
    private static EditText bottomMemeText;
    private static Button topButton;

    private TopSectionFragementListener activityCommandar;

    public interface TopSectionFragementListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        activityCommandar = (TopSectionFragementListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragement, container, false);

        topMemeText = (EditText) view.findViewById(R.id.topMemeText);
        bottomMemeText = (EditText) view.findViewById(R.id.bottomMemeText);
        topButton = (Button) view.findViewById(R.id.topButton);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                captureButtonClickEvent(view);
            }
        });
        return view;
    }

    private void captureButtonClickEvent(View view) {
        activityCommandar.createMeme(topMemeText.getText().toString(), bottomMemeText.getText().toString());
    }
}
