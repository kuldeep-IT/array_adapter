package com.example.arrayadapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
  public WordAdapter(Activity context, ArrayList<Word> arrayList)
  {
      super(context,0,arrayList);
  }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

      View listView = convertView;

      if (listView==null)
      {
            listView =LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
      }

    Word currentWord = getItem(position);

      TextView gujarati = (TextView) listView.findViewById(R.id.gujarati);
      gujarati.setText(currentWord.getGujarati());

      TextView english  = (TextView) listView.findViewById(R.id.english);
      english.setText(currentWord.getEnglish());

      ImageView photo = (ImageView) listView.findViewById(R.id.photo);
      photo.setImageResource(currentWord.getPhoto());




        return listView;

    }
}
