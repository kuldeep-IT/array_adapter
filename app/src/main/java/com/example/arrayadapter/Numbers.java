package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        listView = findViewById(R.id.list_item);

        ArrayList<Word> arrayList=new ArrayList<Word>();

        Word w= new Word("ek","one",R.drawable.img1);
        arrayList.add(w);

        Word w1=new Word("be","two",R.drawable.img2);
        arrayList.add(w1);

        Word w3 = new Word("tran","three",R.drawable.img3);
        arrayList.add(w3);

        WordAdapter adapter=new  WordAdapter(this,arrayList);

        listView.setAdapter(adapter);


    }
}
