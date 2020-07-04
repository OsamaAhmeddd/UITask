package com.osama.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AccountActivity extends AppCompatActivity {
    ArrayList<UserModel> userModellist;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    AccountAdapter accountAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        userModellist = new ArrayList<>();
        userModellist.add(new UserModel("Osama","Hi"));
        userModellist.add(new UserModel("Osama","Hi"));

        userModellist.add(new UserModel("Osama","Hi"));
        accountAdapter=new AccountAdapter(this,userModellist);
        mRecyclerView.setAdapter(accountAdapter);


    }
}
