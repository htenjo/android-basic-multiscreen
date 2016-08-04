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

        GraphicWordAdapter itemsAdapter = new GraphicWordAdapter(this, numbers, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

    private List<Word> buildNumberList(){
        List<Word> numbers = new ArrayList<>();
        numbers.add(new Word("One","lutti", R.drawable.number_one, R.raw.number_one));
        numbers.add(new Word("Two","otiiko", R.drawable.number_two, R.raw.number_two));
        numbers.add(new Word("Three","tolookosu", R.drawable.number_three, R.raw.number_three));
        numbers.add(new Word("Four","oyyisa", R.drawable.number_four, R.raw.number_four));
        numbers.add(new Word("Five","massokka", R.drawable.number_five, R.raw.number_five));
        numbers.add(new Word("Six","temmokka", R.drawable.number_six, R.raw.number_six));
        numbers.add(new Word("Seven","kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numbers.add(new Word("Eight","kawinta", R.drawable.number_eight, R.raw.number_eight));
        numbers.add(new Word("Nine","wo’e", R.drawable.number_nine, R.raw.number_nine));
        numbers.add(new Word("Ten","na’aacha", R.drawable.number_ten, R.raw.number_ten));

        return numbers;
    }
}