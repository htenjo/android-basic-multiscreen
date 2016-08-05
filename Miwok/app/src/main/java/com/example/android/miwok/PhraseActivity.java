package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.android.miwok.activities.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class PhraseActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ArrayAdapter buildAdapter() {
        return new WordAdapter(this, this.words, R.color.category_phrases);
    }

    @Override
    protected BaseActivity getInstance() {
        return PhraseActivity.this;
    }

    @Override
    protected List<Word> buildWords(){
        List<Word> numbers = new ArrayList<>();
        numbers.add(new Word("Where are you going?","minto wuksus", Word.RESOURCE_NOT_FOUND, R.raw.phrase_where_are_you_going));
        numbers.add(new Word("What is your name?","tinnә oyaase'nә", Word.RESOURCE_NOT_FOUND, R.raw.phrase_what_is_your_name));
        numbers.add(new Word("My name is...","oyaaset...", Word.RESOURCE_NOT_FOUND, R.raw.phrase_my_name_is));
        numbers.add(new Word("How are you feeling?","michәksәs?", Word.RESOURCE_NOT_FOUND, R.raw.phrase_how_are_you_feeling));
        numbers.add(new Word("I’m feeling good.","kuchi achit", Word.RESOURCE_NOT_FOUND, R.raw.phrase_im_feeling_good));
        numbers.add(new Word("Are you coming?","әәnәs'aa?", Word.RESOURCE_NOT_FOUND, R.raw.phrase_are_you_coming));
        numbers.add(new Word("Yes, I’m coming.","hәә’ әәnәm", Word.RESOURCE_NOT_FOUND, R.raw.phrase_yes_im_coming));
        numbers.add(new Word("I’m coming.","әәnәm", Word.RESOURCE_NOT_FOUND, R.raw.phrase_im_coming));
        numbers.add(new Word("Let’s go.","yoowutis", Word.RESOURCE_NOT_FOUND, R.raw.phrase_lets_go));
        numbers.add(new Word("Come here.","әnni'nem", Word.RESOURCE_NOT_FOUND, R.raw.phrase_come_here));

        return numbers;
    }
}