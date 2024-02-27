package com.example.multy_lab_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Image> images = new ArrayList<>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setData();
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.rview);
            CustomRecyclerAdapter adapter = new CustomRecyclerAdapter(this,
                    images);
            recyclerView.setAdapter(adapter);
        }
    private void setData(){
        images.add(new Image ("monkey1", R.drawable.image1));
        images.add(new Image ("monkey2", R.drawable.image2));
        images.add(new Image ("monkey3", R.drawable.image3));
        images.add(new Image ("monkey4", R.drawable.image4));
        images.add(new Image ("monkey5", R.drawable.image5));
    }
}