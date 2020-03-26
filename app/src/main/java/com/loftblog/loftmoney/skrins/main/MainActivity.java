package com.loftblog.loftmoney.skrins.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.loftblog.loftmoney.R;
import com.loftblog.loftmoney.skrins.main.adapter.ItemAdapter;
import com.loftblog.loftmoney.skrins.second.SecondActivity;

public class MainActivity extends AppCompatActivity {

    private ItemAdapter ItemAdapter = new ItemAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setAdapter(ItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}


