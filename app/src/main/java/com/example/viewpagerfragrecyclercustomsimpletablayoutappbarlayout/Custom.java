package com.example.viewpagerfragrecyclercustomsimpletablayoutappbarlayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Custom extends Fragment {

    ListView mylistView;
    ArrayList<ContactData> myArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_custom,container,false);

        mylistView = myView.findViewById(R.id.CustomList_view);
        myArrayList = new ArrayList<>();
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));

        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));

        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));
        myArrayList.add(new ContactData("dawood","03422330877"));

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(getContext(),R.layout.custom_view,myArrayList);
        mylistView.setAdapter(myCustomAdapter);

        return myView;
    }
}
