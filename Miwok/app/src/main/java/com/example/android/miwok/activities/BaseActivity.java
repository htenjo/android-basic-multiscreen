package com.example.android.miwok.activities;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.model.Word;

import java.util.List;

/**
 * Created by htenjo on 8/5/16.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected MediaPlayer player;
    protected MediaPlayer.OnCompletionListener onCompletionListener;
    protected AdapterView.OnItemClickListener onItemClickListener;
    protected AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
    protected ArrayAdapter<?> adapter;
    protected List<Word> words;
    protected AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_list);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        words = buildWords();
        adapter = buildAdapter();
        buildCompletionListener();
        buildOnItemClickListener();
        buildOnAudioFocusChangeListener();

        ListView listView = (ListView) findViewById(R.id.list);

        if(listView != null) {
            listView.setAdapter(this.adapter);
            listView.setOnItemClickListener(this.onItemClickListener);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();

    }

    private void buildCompletionListener(){
        this.onCompletionListener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(final MediaPlayer mp) {
                if(mp != null){
                    mp.release();
                }
            }
        };
    }

    private void buildOnItemClickListener(){
        this.onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentWord = words.get(position);
                releaseMediaPlayer();

                int result = audioManager.requestAudioFocus(onAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){
                    player = MediaPlayer.create(getInstance(), currentWord.getSoundId());
                    player.start();
                    player.setOnCompletionListener(onCompletionListener);
                }
            }
        };
    }

    private void buildOnAudioFocusChangeListener(){
        onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
            @Override
            public void onAudioFocusChange(int focusChange) {
                if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                    //Pause playback
                    player.pause();
                    player.seekTo(0);
                }else if (focusChange == AudioManager.AUDIOFOCUS_GAIN){
                    //Resume playback
                    player.start();
                }else if (focusChange == AudioManager.AUDIOFOCUS_LOSS){
                    releaseMediaPlayer();
                }
            }
        };
    }

    protected void releaseMediaPlayer(){
        if(this.player != null){
            player.release();
            player = null;

            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    protected abstract ArrayAdapter buildAdapter();

    protected abstract List<Word> buildWords();

    protected abstract BaseActivity getInstance();
}
