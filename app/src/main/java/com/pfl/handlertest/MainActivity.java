package com.pfl.handlertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    TextView textView1;

    int cnt = 0;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        textView1 = findViewById(R.id.textView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.sendEmptyMessageDelayed(0, 3000);
            }
        });

        handler = new Handler(getMainLooper()) {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                cnt++;
                textView1.setText(String.valueOf(cnt));
            }
        };

        //Looper looper = getMainLooper();


    }
}