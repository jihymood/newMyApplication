package com.example.bezier.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by HASEE on 2017/5/3 16:20
 */
public class BezierView extends View {

    private Paint paint;
    private int mWidth,mHeight;
    private float mScaleW, mScaleH;
    private int mCenterX, mCenterY;

    public BezierView(Context context) {
        super(context);
        init();
    }

    public BezierView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BezierView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(60);
        paint.setPathEffect(new CornerPathEffect(4));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Path path = new Path();
//        path.moveTo(88, 230);
////        path.quadTo(556, 188, 400, 250);
//        path.cubicTo(225, 416, 277, 67, 400, 250);
////        path.lineTo(5.82f * mScaleW, 51.78f * mScaleH);
//        canvas.drawPath(path, paint);

//        Path path = new Path();
//        path.moveTo(5.82f * mScaleW, 51.78f * mScaleH);
//        path.quadTo(24 * mScaleW, 28 * mScaleH, 51.2f * mScaleW, 34.4f * mScaleH);
//        path.cubicTo(51f * mScaleW, 14 * mScaleH, 113 * mScaleW, -3 * mScaleH, mWidth, 51.78f * mScaleH);
//        path.lineTo(5.82f * mScaleW, 51.78f * mScaleH);
//        canvas.drawPath(path, paint);


        int with=canvas.getWidth();
        int height=canvas.getHeight();
        Log.e("BezierView", "with:" + with+"\nheight:" + height);
        canvas.drawColor(Color.YELLOW);
        canvas.drawRect(new Rect(0, 0, 100, 68),paint);
//        canvas.rotate(45);
//        canvas.drawRect(new Rect(0, 0, 100, 68),paint);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        mWidth = w; //600
        mHeight = h;  //600
        mScaleW = w / 120; //5.0
        mScaleH = h / 60;  //10.0
        super.onSizeChanged(w, h, oldw, oldh);
        mCenterX = w - 80;  //520
        mCenterY = h / 2; //300
    }
}
