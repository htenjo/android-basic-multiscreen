package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_list);
        List<Word> words = buildColorList();

        GraphicWordAdapter itemsAdapter = new GraphicWordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }


    private List<Word> buildColorList(){
        List<Word> numbers = new ArrayList<>();
        numbers.add(new Word("red","weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        numbers.add(new Word("green","chokokki", R.drawable.color_green, R.raw.color_green));
        numbers.add(new Word("brown","ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        numbers.add(new Word("gray","ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        numbers.add(new Word("black","kululli", R.drawable.color_black, R.raw.color_black));
        numbers.add(new Word("white","kelelli", R.drawable.color_white, R.raw.color_white));
        numbers.add(new Word("dusty yellow","ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        numbers.add(new Word("mustard yellow","chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        return numbers;
    }
}

