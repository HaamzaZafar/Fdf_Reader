package com.App.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.App.myapplication.R;

import java.io.File;
import java.util.List;

public class Row_adapter extends RecyclerView.Adapter<Row_viewholder> {

    private Context context;
    private List<File> pdfFiles;

    public Row_adapter(Context context, List<File> pdfFiles) {
        this.context = context;
        this.pdfFiles = pdfFiles;
    }

    @NonNull
    @Override
    public Row_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Row_viewholder(LayoutInflater.from(context).inflate(R.layout.row_tamplet,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Row_viewholder holder, int position) {

        holder.File_name.setText(pdfFiles.get(position).getName());
        holder.File_name.setSelected(true);

    }

    @Override
    public int getItemCount() {
        return pdfFiles.size();
    }
}
