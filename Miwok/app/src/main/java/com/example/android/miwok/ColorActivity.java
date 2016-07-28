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

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }


    private List<Word> buildColorList(){
        List<Word> numbers = new ArrayList<>();
        numbers.add(new Word("red","weṭeṭṭi"));
        numbers.add(new Word("green","chokokki"));
        numbers.add(new Word("brown","ṭakaakki"));
        numbers.add(new Word("gray","ṭopoppi"));
        numbers.add(new Word("black","kululli"));
        numbers.add(new Word("white","kelelli"));
        numbers.add(new Word("dusty yellow","ṭopiisә"));
        numbers.add(new Word("mustard yellow","chiwiiṭә"));

        return numbers;
    }
}

