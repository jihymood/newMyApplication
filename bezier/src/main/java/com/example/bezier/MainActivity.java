package com.example.bezier;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.bezier.drawable.MyDrawable;
import com.example.bezier.drawable.MyDrawable1;
import com.example.bezier.drawable.SaveRestoreDrawable;

/**
 * 贝塞尔曲线
 */
public class MainActivity extends AppCompatActivity {

    private MyDrawable myDrawable;
    private MyDrawable1 myDrawable1;
    private SaveRestoreDrawable restoreDrawable;
    private Canvas canvas;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image);

        canvas = new Canvas();
        myDrawable = new MyDrawable();
        myDrawable1 = new MyDrawable1();
        myDrawable.draw(canvas);
        myDrawable1.draw(canvas);
//        image.setImageDrawable(myDrawable);
//        image.setImageDrawable(myDrawable1);

        restoreDrawable = new SaveRestoreDrawable();
        restoreDrawable.draw(canvas);
        image.setImageDrawable(restoreDrawable);

    }
}
