package com.App.myapplication.Activities.All_Documents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import com.App.myapplication.Adapters.Row_adapter;
import com.App.myapplication.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Pdf extends AppCompatActivity {

    private Row_adapter adapter;
    private List<File> pdflist;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        runTimePermission();
    }
    private void runTimePermission(){
        Dexter.withContext(Pdf.this).withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                     displaypdf();
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }
                }).check();
    }


    public ArrayList<File> findPdf(File file){
        ArrayList<File> arrayList = new ArrayList<>();
        File[] files = file.listFiles();

        for (File singleFile : files){
            if (singleFile.isDirectory() && !singleFile.isHidden()){
                try {
                    arrayList.addAll(findPdf(singleFile));
                }
                catch (Exception e){
                    Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
                }

            }else {
                if (singleFile.getName().endsWith(".pdf")){
                    arrayList.add(singleFile);
                }
            }
        }
        return arrayList;
    }

    public void displaypdf(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_pdf);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        pdflist = new ArrayList<>();
        pdflist.addAll(findPdf(Environment.getExternalStorageDirectory()));
        adapter = new Row_adapter(this,pdflist);
        recyclerView.setAdapter(adapter);
    }






}