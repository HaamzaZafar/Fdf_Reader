package com.App.myapplication.Fragments;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.App.myapplication.R;

public class fgadapter extends FragmentPagerAdapter {
    Context context;
    public fgadapter(@NonNull FragmentManager fm,Context context) {
        super(fm);
        this.context=context;
    }





    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Documents_Files();
        } else if (position == 1) {
            return new Pdf_Options();
        } else  {
            return new Tools();

        }  }



    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return context.getString(R.string.Documents);
        }else if (position==1){
            return context.getString(R.string.Pdf_Options);
        }else {
            return context.getString(R.string.Tools);
        }
    }

}