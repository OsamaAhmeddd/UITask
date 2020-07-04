package com.osama.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<UserModel> userModellist;
    private RecyclerView mRecyclerView;
    private GridLayoutManager mLayoutManager;
    GridAdapter gridAdapter;
   ImageView imageViewBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewBack=findViewById(R.id.imageView);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AccountActivity.class));
            }
        });
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        userModellist = new ArrayList<>();
        userModellist.add(new UserModel("Osama","Hi"));
        userModellist.add(new UserModel("Osama","Hi"));

        userModellist.add(new UserModel("Osama","Hi"));
gridAdapter=new GridAdapter(this,userModellist);
        mRecyclerView.setAdapter(gridAdapter);

    }
}
