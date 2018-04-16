package com.example.dj.broadcastdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DJ on 26/03/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder> {
    private static final String TAG = "RecyclerAdapter";

    private ArrayList<IncomingNumber> arrayList = new ArrayList<>();
    Context context;

    public RecyclerAdapter(ArrayList<IncomingNumber> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_numbers,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.id.setText(Integer.toString(arrayList.get(position).getId()));
        Log.d(TAG, "onBindViewHolder: "+arrayList.get(position).getNumber());
        holder.number.setText(arrayList.get(position).getNumber());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        TextView id, number;

        public myViewHolder(View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_number);
            number = itemView.findViewById(R.id.numbers_de);
        }
    }
}
