package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       ListView lv ;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list_view);

        ArrayList<String> names = new ArrayList<>();
        names.add("Mahmoud");
        names.add("Malek");
        names.add("Marwan");

        MyAdapter adapter =new MyAdapter(this,
                android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);




    }
}