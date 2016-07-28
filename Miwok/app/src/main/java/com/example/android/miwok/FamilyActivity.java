package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {
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
        numbers.add(new Word("father","әpә"));
        numbers.add(new Word("mother","әṭa"));
        numbers.add(new Word("son","angsi"));
        numbers.add(new Word("daughter","tune"));
        numbers.add(new Word("older brother","taachi"));
        numbers.add(new Word("younger brother","chalitti"));
        numbers.add(new Word("older sister","teṭe"));
        numbers.add(new Word("younger sister","kolliti"));
        numbers.add(new Word("grandmother","ama"));
        numbers.add(new Word("grandfather","paapa"));

        return numbers;
    }
}