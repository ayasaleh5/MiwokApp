package com.example.miwokapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {
   private int mcolorResourceId;

    public wordAdapter(Context context, ArrayList<word> words,int colorResourceId){

        super(context, 0, words);
        mcolorResourceId=colorResourceId;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        View listitemview = convertView;
        if (listitemview==null){
            listitemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);
        TextView miwoktv = (TextView) listitemview.findViewById(R.id.miwok_tv);
        miwoktv.setText(currentWord.getmMiwoktrans());

        TextView defulttv = (TextView) listitemview.findViewById(R.id.default_tv);
       defulttv.setText(currentWord.getDefulttrans());

        ImageView image = (ImageView) listitemview.findViewById(R.id.image);
        if (currentWord.hasImage()) {

            image.setImageResource(currentWord.getmImageResourceId());
            image.setVisibility(View.VISIBLE);

        }
        else {
            image.setVisibility(View.GONE);
        }

        View textcontainer = listitemview.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        textcontainer.setBackgroundColor(color);



        return listitemview;
    }
}
