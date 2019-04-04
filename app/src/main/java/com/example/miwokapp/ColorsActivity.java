package com.example.miwokapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("weṭeṭṭi", "red", R.drawable.color_red, R.raw.color_red));
        words.add(new word("chokokki", "green", R.drawable.color_green, R.raw.color_green));
        words.add(new word("ṭakaakki", "brown", R.drawable.color_brown, R.raw.color_brown));
        words.add(new word("ṭopoppi", "gray", R.drawable.color_gray, R.raw.color_gray));
        words.add(new word("massoka", "black", R.drawable.color_black, R.raw.color_black));
        words.add(new word("kelelli", "white", R.drawable.color_white, R.raw.color_white));
        words.add(new word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        wordAdapter adapter = new wordAdapter(this, words,R.color.colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getmAduio());
                mMediaPlayer.start();
            }
        });
    }
}
