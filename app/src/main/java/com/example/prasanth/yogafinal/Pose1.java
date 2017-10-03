package com.example.prasanth.yogafinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static com.example.prasanth.yogafinal.R.layout.activity_camera;
import static com.example.prasanth.yogafinal.R.layout.fragment_pose1;

public class Pose1 extends Fragment {
    private Button buttonPose1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buttonPose1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getContext();
                Intent intent = new Intent(context, Camera.class);
                startActivity(intent);
            }
        });

    }
}
