package com.App.myapplication.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.App.myapplication.Activities.All_Documents.All_Documents;
import com.App.myapplication.Activities.All_Documents.Bookmark_File;
import com.App.myapplication.Activities.All_Documents.Folder_Files;
import com.App.myapplication.Activities.All_Documents.Pdf;
import com.App.myapplication.Activities.All_Documents.Rar;
import com.App.myapplication.Activities.All_Documents.Recent_Files;
import com.App.myapplication.Activities.All_Documents.Rtf;
import com.App.myapplication.Activities.All_Documents.Sheets;
import com.App.myapplication.Activities.All_Documents.Slide;
import com.App.myapplication.Activities.All_Documents.Text;
import com.App.myapplication.Activities.All_Documents.Word;
import com.App.myapplication.Activities.All_Documents.Zip;
import com.App.myapplication.R;


public class Documents_Files extends Fragment {

    CardView Alldocs,word,pdf,slide,sheet,text,zip,rar,rtf,folderfile,bookmark,recentfile;
    public Documents_Files() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_documents__files, container, false);
        initviews(v);
        eventhandling();
        return v;


    }

    private void eventhandling() {
        Alldocs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), All_Documents.class));
            }
        });

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Word.class));
            }
        });

        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Pdf.class));
            }
        });

        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Slide.class));
            }
        });

        sheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Sheets.class));
            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Text.class));
            }
        });

        zip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Zip.class));
            }
        });

        rar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Rar.class));
            }
        });

        rtf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Rtf.class));
            }
        });

        folderfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Folder_Files.class));
            }
        });

        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Bookmark_File.class));
            }
        });

        recentfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Recent_Files.class));
            }
        });
    }

    private void initviews(View v) {
        Alldocs = v.findViewById(R.id.all_Docs_File);
        word = v.findViewById(R.id.word);
        pdf = v.findViewById(R.id.pdf);
        slide = v.findViewById(R.id.slide);
        sheet = v.findViewById(R.id.sheet);
        text = v.findViewById(R.id.text);
        zip = v.findViewById(R.id.zip);
        rar = v.findViewById(R.id.rar);
        rtf = v.findViewById(R.id.rtf);
        folderfile = v.findViewById(R.id.folder);
        bookmark = v.findViewById(R.id.bookmar);
        recentfile = v.findViewById(R.id.recent_file);
    }
}