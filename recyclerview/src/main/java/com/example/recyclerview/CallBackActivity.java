package com.example.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CallBackActivity extends AppCompatActivity {


    TextView textClick;
    private TextView textView,textView1;
    private onCustomClickListener onCustomClickListener;

    public interface onCustomClickListener {
        void customClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_back);

        textView = (TextView) findViewById(R.id.text_click);
        textView1 = (TextView) findViewById(R.id.text_click1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CallBackActivity.this, "我是系统自带的点击事件", Toast.LENGTH_SHORT).show();
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCustomClickListener.customClick();
            }
        });






    }

}
