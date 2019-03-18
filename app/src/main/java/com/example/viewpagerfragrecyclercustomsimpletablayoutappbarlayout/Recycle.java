package com.example.viewpagerfragrecyclercustomsimpletablayoutappbarlayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Recycle extends Fragment {

    RecyclerView MyrecyclerView;
    ArrayList<RecycleData> recycleDataArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View Myview = LayoutInflater.from(getContext()).inflate(R.layout.fragment_recycle,container,false);

        MyrecyclerView = Myview.findViewById(R.id.myRecycleList_View);
        recycleDataArrayList = new ArrayList<>();
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));

        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));

        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));

        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));

        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));

        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));
        recycleDataArrayList.add(new RecycleData("Dawood","03422330877"));

        MyRecyclerAdater myRecyclerAdater = new MyRecyclerAdater(recycleDataArrayList);
        MyrecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MyrecyclerView.setAdapter(myRecyclerAdater);


        return Myview;
    }
}
