package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


public class News extends Fragment {

    private RecyclerView recyclerViewNews;
    private TextView TNewsDate;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.news, container, false);

        recyclerViewNews = rootView.findViewById(R.id.news_list_recycler);
        TNewsDate = (TextView) rootView.findViewById(R.id.t_news_date);


        return rootView;


    }




}

