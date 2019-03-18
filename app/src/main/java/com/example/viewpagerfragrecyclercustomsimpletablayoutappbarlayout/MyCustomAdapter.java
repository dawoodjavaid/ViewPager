package com.example.viewpagerfragrecyclercustomsimpletablayoutappbarlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter  extends ArrayAdapter<ContactData> {
    ArrayList<ContactData> contactData = new ArrayList<>();

    public MyCustomAdapter(Context context, int resource, ArrayList<ContactData> contactData) {
        super(context,0, contactData);
        this.contactData = contactData;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View myView = LayoutInflater.from(getContext()).inflate(R.layout.custom_view,parent,false);

        TextView textView = myView.findViewById(R.id.nameTv);
        TextView textView1 = myView.findViewById(R.id.contactTv);

        textView.setText(contactData.get(position).getName());
        textView1.setText(contactData.get(position).getContact());



        return myView;
    }
}
