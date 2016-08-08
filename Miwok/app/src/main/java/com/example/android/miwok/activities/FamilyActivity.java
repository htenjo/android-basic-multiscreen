package com.example.android.miwok.activities;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.android.miwok.R;
import com.example.android.miwok.model.Word;
import com.example.android.miwok.adapters.GraphicWordAdapter;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected ArrayAdapter buildAdapter() {
        return new GraphicWordAdapter(this, this.words, R.color.category_family);
    }

    @Override
    protected BaseActivity getInstance() {
        return FamilyActivity.this;
    }

    @Override
    protected List<Word> buildWords(){
        List<Word> numbers = new ArrayList<>();
        numbers.add(new Word("father","әpә", R.drawable.family_father, R.raw.family_father));
        numbers.add(new Word("mother","әṭa", R.drawable.family_mother, R.raw.family_mother));
        numbers.add(new Word("son","angsi", R.drawable.family_son, R.raw.family_son));
        numbers.add(new Word("daughter","tune", R.drawable.family_daughter, R.raw.family_daughter));
        numbers.add(new Word("older brother","taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        numbers.add(new Word("younger brother","chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        numbers.add(new Word("older sister","teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        numbers.add(new Word("younger sister","kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        numbers.add(new Word("grandmother","ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        numbers.add(new Word("grandfather","paapa", R.drawable.family_grandfather, R.raw.family_grandfather));
        return numbers;
    }
}