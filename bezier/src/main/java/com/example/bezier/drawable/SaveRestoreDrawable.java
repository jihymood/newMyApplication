package com.example.bezier.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import static android.R.attr.centerY;

/**
 * Created by HASEE on 2017/5/9 10:42
 */

public class SaveRestoreDrawable extends Drawable {

    private Paint paint;

    public SaveRestoreDrawable() {
        paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        int width = 200;
        int height = 200;
        int radius = 10;
        int centerX = radius;
        int centerY = height - radius;

        canvas.drawCircle(centerX, centerY, radius, paint);
        canvas.save();

        canvas.rotate(90, width / 2, height / 2);
        canvas.drawLine(width / 2, 0, 0, height / 2, paint);
        canvas.drawLine(width / 2, 0, width / 2, height, paint);
        canvas.drawLine(width / 2, 0, width, height / 2, paint);

        canvas.restore();//不加这句，圆会在右下角
        canvas.drawCircle(width - radius, radius, radius, paint);


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
