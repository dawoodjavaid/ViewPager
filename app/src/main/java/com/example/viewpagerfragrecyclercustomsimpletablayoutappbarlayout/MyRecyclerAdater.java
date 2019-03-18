package com.example.viewpagerfragrecyclercustomsimpletablayoutappbarlayout;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerAdater extends RecyclerView.Adapter<MyRecyclerAdater.MyViewHolder> {
    ArrayList<RecycleData> recycleDataArrayList ;

    public MyRecyclerAdater(ArrayList<RecycleData> recycleDataArrayList) {
        this.recycleDataArrayList = recycleDataArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View Myview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_view,viewGroup,false);

        return new MyViewHolder(Myview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.textViewName.setText(recycleDataArrayList.get(i).getName());
        myViewHolder.textViewContact.setText(recycleDataArrayList.get(i).getConatact());
    }

    @Override
    public int getItemCount() {
        return recycleDataArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName,textViewContact;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.Name_Rec_tv);
            textViewContact = itemView.findViewById(R.id.Contact_Rec_tv);
        }
    }


}
