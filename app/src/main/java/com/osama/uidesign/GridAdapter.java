package com.osama.uidesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.MyViewHolder> {


    Context context;
    ArrayList<UserModel> mList;

    public GridAdapter(Context context, ArrayList<UserModel> mList) {
        this.context = context;
        this.mList = mList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_row, viewGroup, false);
        return new GridAdapter.MyViewHolder(view);

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
        TextView nametextView,message;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nametextView = itemView.findViewById(R.id.textView5);
            message = itemView.findViewById(R.id.textView6);

        }
    }
}

