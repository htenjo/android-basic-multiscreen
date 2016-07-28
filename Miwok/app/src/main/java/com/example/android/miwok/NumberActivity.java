package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_list);
        List<Word> numbers = buildNumberList();

        WordAdapter itemsAdapter = new WordAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

    private List<Word> buildNumberList(){
        List<Word> numbers = new ArrayList<>();
        numbers.add(new Word("One","lutti"));
        numbers.add(new Word("Two","otiiko"));
        numbers.add(new Word("Three","tolookosu"));
        numbers.add(new Word("Four","oyyisa"));
        numbers.add(new Word("Five","massokka"));
        numbers.add(new Word("Six","temmokka"));
        numbers.add(new Word("Seven","kenekaku"));
        numbers.add(new Word("Eight","kawinta"));
        numbers.add(new Word("Nine","wo’e"));
        numbers.add(new Word("Ten","na’aacha"));

        return numbers;
    }
}