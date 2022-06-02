package com.App.myapplication.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.App.myapplication.Activities.pdf_options.Add_PDF_Password;
import com.App.myapplication.Activities.pdf_options.Image_to_PDF;
import com.App.myapplication.Activities.pdf_options.Merg_to_PDF;
import com.App.myapplication.Activities.pdf_options.My_Creation;
import com.App.myapplication.Activities.pdf_options.PDF_to_Image;
import com.App.myapplication.Activities.pdf_options.Read_Online_PDF;
import com.App.myapplication.Activities.pdf_options.Remove_PDF_Password;
import com.App.myapplication.Activities.pdf_options.Text_to_PDF;
import com.App.myapplication.R;


public class Pdf_Options extends Fragment {

    CardView imagetopdf,texttopdf,pdftoimage,addpdfpassword,removepdfpassword,readonlinepdf,mergepdf,mycreation;
    public Pdf_Options() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pdf__options, container, false);
        initviews(v);
        eventhandling();
        return v;
    }

    private void eventhandling() {
        //imagetopdf.setOnClickListener(new View.OnClickListener() {
         //   @Override
        //    public void onClick(View v) {
        //        startActivity(new Intent(getContext(),Image_to_PDF.class));
        //    }
      //  });

        texttopdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Text_to_PDF.class));
            }
        });

        pdftoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PDF_to_Image.class));
            }
        });

        addpdfpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Add_PDF_Password.class));
            }
        });

        removepdfpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Remove_PDF_Password.class));
            }
        });

        readonlinepdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Read_Online_PDF.class));
            }
        });

        mergepdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Merg_to_PDF.class));
            }
        });

        mycreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), My_Creation.class));
            }
        });


    }

    private void initviews(View v) {
        imagetopdf=v.findViewById(R.id.Imagetopdf1);
        texttopdf =v.findViewById(R.id.Texttopdf);
        pdftoimage=v.findViewById(R.id.Pdftoimage);
        addpdfpassword=v.findViewById(R.id.Addpdftopassword);
        removepdfpassword=v.findViewById(R.id.Removepdfpassword);
        readonlinepdf=v.findViewById(R.id.Readonlinepdf);
        mergepdf=v.findViewById(R.id.Mergpdf);
        mycreation=v.findViewById(R.id.Mycreation);
    }
}