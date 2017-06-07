package com.example.bezier.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by HASEE on 2017/5/9 09:31
 */

public class MyDrawable1 extends Drawable {

    private Paint paint;


    public MyDrawable1() {
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        int with = 200;
        int height = 200;
        int centerX = with / 2;
        int centerY = height / 2;
        int radius = 10;
        int imgWith = canvas.getWidth();
        int imgHeight = canvas.getHeight();

        canvas.drawRect(0, 0, with, height, paint);
        canvas.save();
        canvas.rotate(90, imgWith / 2, imgHeight / 2);
        canvas.drawLine(0, imgHeight / 2, imgWith, imgHeight / 2, paint);
        canvas.restore();
        canvas.drawCircle(with - radius, radius, radius, paint);

    }

    @Override
    public void setAlpha(@IntRange(from = 0, to = 255) int alpha) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }
}
