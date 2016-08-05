package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by htenjo on 7/28/16.
 */
public class WordAdapter extends ArrayAdapter<Word>{
    private int colorId;

    public WordAdapter(Context context, List<Word> objects, int colorId) {
        super(context, 0, objects);
        this.colorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_simple, parent, false);
        }

        Word currentWord = getItem(position);
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        englishTextView.setText(currentWord.getEnglishTranslation());

        currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        LinearLayout textLayout = (LinearLayout)listItemView.findViewById(R.id.text_layout);
        int realColor = ContextCompat.getColor(getContext(), this.colorId);
        textLayout.setBackgroundColor(realColor);

        return listItemView;
    }
}
