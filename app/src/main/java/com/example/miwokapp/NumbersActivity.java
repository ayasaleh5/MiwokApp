package com.example.miwokapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("lutti", "one", R.drawable.number_one, R.raw.number_one));
        words.add(new word("otiiko", "two", R.drawable.number_two, R.raw.number_two));
        words.add(new word("tolookosu", "three", R.drawable.number_three, R.raw.number_three));
        words.add(new word("oyyisa", "four", R.drawable.number_four, R.raw.number_four));
        words.add(new word("massoka", "five", R.drawable.number_five, R.raw.number_five));
        words.add(new word("temmoka", "six", R.drawable.number_six, R.raw.number_six));
        words.add(new word("kenekaku", "seven", R.drawable.number_seven, R.raw.number_seven));
        words.add(new word("kawinta", "eight", R.drawable.number_eight, R.raw.number_eight));
        words.add(new word("wo'e", "nine", R.drawable.number_nine, R.raw.number_nine));
        words.add(new word("na'aacha", "ten", R.drawable.number_ten, R.raw.number_ten));

        wordAdapter adapter = new wordAdapter(this, words, R.color.numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getmAduio());
                mMediaPlayer.start();
            }
        });


    }
}
