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
        String uri = "@drawable/ic_call";  // where myresource (without the extension) is the file

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());

        userModellist.add(new UserModel("Phone","Hi",imageResource));
        userModellist.add(new UserModel("Google","Hi",getResources().getIdentifier("@drawable/ic_brands_and_logotypes", null, getPackageName())));

        userModellist.add(new UserModel("Facebook","Hi",getResources().getIdentifier("@drawable/ic_facebook", null, getPackageName())));
        userModellist.add(new UserModel("Twitter","Hi",getResources().getIdentifier("@drawable/ic_twitter", null, getPackageName())));
        userModellist.add(new UserModel("Instagam","Hi",getResources().getIdentifier("@drawable/ic_instagram_sketched", null, getPackageName())));
        userModellist.add(new UserModel("Whatsapp","Hi",getResources().getIdentifier("@drawable/ic_whatsapp", null, getPackageName())));

        accountAdapter=new AccountAdapter(this,userModellist);
        mRecyclerView.setAdapter(accountAdapter);


    }
}
