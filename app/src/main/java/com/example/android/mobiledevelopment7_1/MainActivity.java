package com.example.android.mobiledevelopment7_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<President> mPresidents;
    private PresidentAdapter mPresidentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler);
        mPresidents = new ArrayList<>();
        mPresidents.addAll(PresidentData.getListData());

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mPresidentAdapter = new PresidentAdapter(this, mPresidents);
        mRecyclerView.setAdapter(mPresidentAdapter);
    }
}
