package com.App.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.App.myapplication.Fragments.fgadapter;
import com.App.myapplication.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tabLayout);
        fgadapter fgadapter=new fgadapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(fgadapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}