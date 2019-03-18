package com.example.viewpagerfragrecyclercustomsimpletablayoutappbarlayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Simple extends Fragment {

    ArrayList<String> stringArrayList = new ArrayList<>();
    ListView mylistView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View Myview = LayoutInflater.from(getContext()).inflate(R.layout.fragment_simple,container,false);

        mylistView = Myview.findViewById(R.id.SimpleList_View);
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");
        stringArrayList.add("dawood");
        stringArrayList.add("Javadid");

    ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(),R.layout.support_simple_spinner_dropdown_item,stringArrayList);
    mylistView.setAdapter(arrayAdapter);

        return Myview;
    }

}
