package com.example.recyclerviewinsidenestedscrollview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class PhoneViewHolder extends RecyclerView.ViewHolder {
    ImageView phoneImage;
    TextView phoneName;
    PhoneViewHolder(View itemView) {
        super(itemView);
        phoneName = itemView.findViewById(R.id.phoneName);
        phoneImage = itemView.findViewById(R.id.phoneImage);
    }
}