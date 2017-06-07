package com.example.bezier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.bezier.utils.ClassUtil;

import java.io.IOException;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        try {
            final List<Class<?>> allAssignedClass = ClassUtil.getAllAssignedClass(SecondActivity.class);
            for (Class<?> allAssignedClas : allAssignedClass) {
                Log.e("SecondActivity", "allAssignedClas:" + allAssignedClas.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
