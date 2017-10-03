package com.example.prasanth.yogafinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);

        Button advanceToPageWithTabs = (Button) findViewById(R.id.buttonTxt);
        advanceToPageWithTabs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, PageWithTabs.class);
                startActivity(intent);

            }
        });
    }

}
