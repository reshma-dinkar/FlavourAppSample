package com.example.app.flavoursampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.tv_app_id)).setText(BuildConfig.APPLICATION_ID);
        button = findViewById(R.id.btn_test);
        button.setText(Util.FLAVOUR_CONSTANT);

        if (BuildConfig.APPLICATION_ID.contains(".dev")) {
            button.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button.getText().toString().equals("Test Beta")) {
                    //TODO Implement Beta app logic
                } else {
                    //TODO Implement Prod app logic
                }
            }
        });
    }
}
