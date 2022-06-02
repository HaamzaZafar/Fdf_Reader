package com.App.myapplication.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.App.myapplication.Activities.tools.Create_Notes;
import com.App.myapplication.Activities.tools.Document_Scanner;
import com.App.myapplication.Activities.tools.Scan_Barcode;
import com.App.myapplication.Activities.tools.Scan_Qr_Code;
import com.App.myapplication.Activities.tools.Setting;
import com.App.myapplication.R;


public class Tools extends Fragment {

    CardView createnotes,scanqrcode,scanbarcode,documentscanner,setting;
    public Tools() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tools, container, false);
        initviews(v);
        eventhandling();
        return v;
    }

    private void eventhandling() {
        createnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Create_Notes.class));
            }
        });

        scanqrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Scan_Qr_Code.class));
            }
        });
        scanbarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Scan_Barcode.class));
            }
        });
        documentscanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Document_Scanner.class));
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Setting.class));
            }
        });


    }

    private void initviews(View v) {
        createnotes = v.findViewById(R.id.Createnewnotes);
        scanqrcode = v.findViewById(R.id.Scanqrcode);
        scanbarcode = v.findViewById(R.id.Scanbarcode);
        documentscanner = v.findViewById(R.id.Documentscanner);
        setting = v.findViewById(R.id.Setting);
    }
}