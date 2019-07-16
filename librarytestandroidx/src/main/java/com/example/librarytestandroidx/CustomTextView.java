package com.example.librarytestandroidx;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomTextView {
    public static void createStupidTextView(Context context, LinearLayout linearLayout) {
        RecyclerView recyclerView = new RecyclerView(context);
        TextView textView = new TextView(context);
        textView.setText("I am stupid, just like you");
        textView.setTextColor(Color.RED);
        textView.setTextSize(18);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
    }
}
