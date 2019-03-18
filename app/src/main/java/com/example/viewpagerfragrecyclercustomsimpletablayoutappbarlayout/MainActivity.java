package com.example.viewpagerfragrecyclercustomsimpletablayoutappbarlayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout_id);
        viewPager = findViewById(R.id.viewPage_id);
        appBarLayout = findViewById(R.id.appBar_id);


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFrag(new Simple(),"Simple");
        viewPagerAdapter.AddFrag(new Custom(),"Custom");
        viewPagerAdapter.AddFrag(new Recycle(),"Recycle");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }



}
