package com.example.bhuwan.testapp.listview.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bhuwan.testapp.R;

/**
 * Created by bhuwan on 7/31/16.
 */
public class CustomViewAdaptor extends ArrayAdapter<String> {

    public CustomViewAdaptor(Context context, String[] companies) {
        super(context, R.layout.custom_view, companies);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View customView = LayoutInflater.from(getContext()).inflate(R.layout.custom_view, parent, false);

        String food = getItem(position);
        ImageView customImgView = (ImageView) customView.findViewById(R.id.customImgView);
        TextView customTextView = (TextView) customView.findViewById(R.id.customTextView);

        customTextView.setText(food);
        customImgView.setImageResource(R.drawable.prisha);
        return customView;
    }
}
