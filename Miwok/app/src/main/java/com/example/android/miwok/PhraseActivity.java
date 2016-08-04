package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhraseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_list);
        List<Word> words = buildColorList();

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }


    private List<Word> buildColorList(){
        List<Word> numbers = new ArrayList<>();
        numbers.add(new Word("Where are you going?","minto wuksus"));
        numbers.add(new Word("What is your name?","tinnә oyaase'nә"));
        numbers.add(new Word("My name is...","oyaaset..."));
        numbers.add(new Word("How are you feeling?","michәksәs?"));
        numbers.add(new Word("I’m feeling good.","kuchi achit"));
        numbers.add(new Word("Are you coming?","әәnәs'aa?"));
        numbers.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        numbers.add(new Word("I’m coming.","әәnәm"));
        numbers.add(new Word("Let’s go.","yoowutis"));
        numbers.add(new Word("Come here.","әnni'nem"));

        return numbers;
    }
}