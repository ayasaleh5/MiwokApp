package com.example.miwokapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("minto wuksus", "Where are you going?",R.raw.phrase_where_are_you_going));
        words.add(new word("tinnә oyaase'nә", "What is your name?",R.raw.phrase_what_is_your_name));
        words.add(new word("oyaaset", "My name is...",R.raw.phrase_my_name_is));
        words.add(new word("michәksәs?", "How are you feeling?",R.raw.phrase_how_are_you_feeling));
        words.add(new word("kuchi achit", "I’m feeling good." ,R.raw.phrase_im_feeling_good));
        words.add(new word("әәnәs'aa?", "Are you coming?",R.raw.phrase_are_you_coming));
        words.add(new word("hәә’ әәnәm", "Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        words.add(new word("әәnәm", "I’m coming.",R.raw.phrase_im_coming));
        words.add(new word("yoowutis'e", "Let’s go.",R.raw.phrase_lets_go));
        words.add(new word("әnni'nem", "Come here.",R.raw.phrase_come_here));

        wordAdapter adapter = new wordAdapter(this, words ,R.color.phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getmAduio());
                mMediaPlayer.start();
            }
        });

    }
}
