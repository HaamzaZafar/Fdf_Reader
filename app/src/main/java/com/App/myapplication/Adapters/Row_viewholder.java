package com.App.myapplication.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.App.myapplication.Activities.All_Documents.Text;
import com.App.myapplication.R;


public class Row_viewholder extends RecyclerView.ViewHolder {

    public TextView File_name,File_detail;
    public ConstraintLayout constraintLayout_click;
    public ImageView File_image;

    public Row_viewholder(@NonNull View itemView) {
        super(itemView);
        File_name = itemView.findViewById(R.id.file_name);
        File_detail = itemView.findViewById(R.id.file_detail);
        constraintLayout_click = itemView.findViewById(R.id.constraint_click);
        File_image = itemView.findViewById(R.id.file_image);
    }
}
