package com.example.miwokapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("әpә", "father", R.drawable.family_father, R.raw.family_father));
        words.add(new word("әṭa", "mother", R.drawable.family_mother, R.raw.family_mother));
        words.add(new word("angsi", "son", R.drawable.family_son, R.raw.family_son));
        words.add(new word("tune", "daughter", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new word("taachi", "older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new word("chalitti", "younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new word("teṭe", "older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new word("kolliti", "younger sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new word("wo'ama", "grand mother", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new word("na'paapa", "grand father", R.drawable.family_grandfather, R.raw.family_grandfather));

        wordAdapter adapter = new wordAdapter(this, words,R.color.family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getmAduio());
                mMediaPlayer.start();
            }
        });

    }
}
