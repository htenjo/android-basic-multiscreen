package com.example.android.miwok.activities;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;

import java.util.List;

/**
 * Created by htenjo on 8/5/16.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected MediaPlayer player;
    protected MediaPlayer.OnCompletionListener completionListener;
    protected AdapterView.OnItemClickListener itemClickListener;
    protected ArrayAdapter<?> adapter;
    protected List<Word> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_list);

        words = buildWords();
        adapter = buildAdapter();
        buildCompletionListener();
        buildOnItemClickListener();

        ListView listView = (ListView) findViewById(R.id.list);

        if(listView != null) {
            listView.setAdapter(this.adapter);
            listView.setOnItemClickListener(this.itemClickListener);
        }
    }

    private void buildCompletionListener(){
        this.completionListener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if(mp != null){
                    mp.release();
                    mp = null;
                }
            }
        };
    }

    private void buildOnItemClickListener(){
        this.itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentWord = words.get(position);
                if(player != null){
                    player.release();
                }
                
                player = MediaPlayer.create(getInstance(), currentWord.getSoundId());
                player.start();
                player.setOnCompletionListener(completionListener);
            }
        };
    }

    protected abstract ArrayAdapter buildAdapter();

    protected abstract List<Word> buildWords();

    protected abstract BaseActivity getInstance();
}
