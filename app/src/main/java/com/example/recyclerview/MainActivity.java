package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<extendeditem> moviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        initdate();
        initrecyclerview();

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

}
public void initrecyclerview() {

    recyclerAdapter = new RecyclerAdapter(moviesList);
    recyclerView.setAdapter(recyclerAdapter);

}



public void initdate()
{
    moviesList=new ArrayList<>();


   moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));
    moviesList.add( new extendeditem("FYP MEETING","2:30","12/3/19","a  nice nmeeting","10000"));



}
}



