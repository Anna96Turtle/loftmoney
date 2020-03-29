package com.loftblog.loftmoney.skrins.main;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.loftblog.loftmoney.R;
import com.loftblog.loftmoney.skrins.main.adapter.Item;
import com.loftblog.loftmoney.skrins.main.adapter.ItemAdapter;
import com.loftblog.loftmoney.skrins.second.SecondActivity;

public class MainActivity extends AppCompatActivity {

    private ItemAdapter itemAdapter = new ItemAdapter();
    static int ADD_ITEM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerMain);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,
                false));

        findViewById(R.id.fabMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivityForResult(secondIntent, ADD_ITEM_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_ITEM_REQUEST && requestCode == RESULT_OK && data != null) {
            Item item = (Item) data.getSerializableExtra(Item.KEY_NAME);
            itemAdapter.addDataToTop(item);
        }
    }
}
