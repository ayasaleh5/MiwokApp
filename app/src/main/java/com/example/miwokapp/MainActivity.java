package com.example.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers= (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
                Toast.makeText(view.getContext(),"open the list of numbers",Toast.LENGTH_SHORT).show();
            }
        });


        TextView colors= (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
                Toast.makeText(view.getContext(),"open the list of colors",Toast.LENGTH_SHORT).show();
            }
        });
        TextView family= (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
                Toast.makeText(view.getContext(),"open the list of family",Toast.LENGTH_SHORT).show();
            }
        });
        TextView phrases= (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
                Toast.makeText(view.getContext(),"open the list of phrases",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
