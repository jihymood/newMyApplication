package com.example.bezier.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by HASEE on 2017/5/8 11:10
 */

public class MyDrawable extends Drawable {
    private Paint paint;

    public MyDrawable() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
//        paint.setAlpha(100);
        paint.setStrokeWidth(10);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
//        canvas.drawRect(0, 0, 200, 68,paint);
//        canvas.drawCircle(50, 50, 25, paint);
//        canvas.drawRect(new Rect(200, 200, 100, 68),paint);
        canvas.drawColor(Color.BLUE);
//        canvas.drawCircle(300, 50, 20, paint);
        canvas.drawRect(new RectF(300, 50, 400, 100), paint);
        canvas.save(); //对画布进行旋转，缩放，平移等操作之前调用canvas.save()来保存画布当前的状态
        canvas.rotate(45);
        canvas.restore(); //画布重置
        canvas.translate(100, 100);
        canvas.drawRect(new RectF(0, 0, 100, 100), paint);
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
