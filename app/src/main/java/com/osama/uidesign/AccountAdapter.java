package com.osama.uidesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.MyViewHolder> {


    Context context;
    ArrayList<UserModel> mList;

    public AccountAdapter(Context context, ArrayList<UserModel> mList) {
        this.context = context;
        this.mList = mList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.account_row, viewGroup, false);
        return new AccountAdapter.MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        final UserModel blockModel = mList.get(i);
        myViewHolder.nametextView.setText(blockModel.getName());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nametextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nametextView = itemView.findViewById(R.id.textView7);

        }
    }
}

