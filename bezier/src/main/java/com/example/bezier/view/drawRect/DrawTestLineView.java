package com.example.bezier.view.drawRect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HASEE on 2017/7/18 12:27
 */

public class DrawTestLineView extends View {

    private List<Point> pointList;
    private List<Point> pointList1;
    private List<TwoPoint> twoPoints;

    private Paint paint;
    private Canvas cacheCanvas;
    private Bitmap cachebBitmap;
    private Path path;
    Region re = new Region();

    public DrawTestLineView(Context context) {
        super(context);
        init();
    }

    public DrawTestLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawTestLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void initData() {
        pointList = new ArrayList<>();
        pointList.add(new Point(50, 50));
        pointList.add(new Point(100, 50));
        pointList.add(new Point(100, 100));
        pointList.add(new Point(200, 100));
        pointList.add(new Point(200, 300));
        pointList.add(new Point(50, 300));
        pointList.add(new Point(50, 50));
    }

    public void getDuixiang() {
        pointList1 = new ArrayList<>();
        pointList1.addAll(pointList);
        twoPoints = new ArrayList<>();
        int size = pointList1.size();
        for (int i = 0; i < size; i++) {

            Point point = pointList1.get(0);
            float x = point.getX();
            float y = point.getY();
            Point point1 = pointList1.get(1);
            float x1 = point1.getX();
            float y1 = point1.getY();

            TwoPoint twoPoint = new TwoPoint(x, y, x1, y1);
            twoPoints.add(twoPoint);
            Log.e("DrawTestLineView", "twoPoints:" + twoPoints.size());
            if (i == size - 2) {
                return;
            }
            pointList1.remove(0);
        }
    }


    public void init() {
        initData();

        getDuixiang();


        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(4);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);

        cachebBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
        cacheCanvas = new Canvas(cachebBitmap);
        cacheCanvas.drawColor(Color.CYAN);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        path = new Path();
        path.moveTo(pointList.get(0).getX(), pointList.get(0).getY());
        for (int i = 1; i < pointList.size(); i++) {
            Point point = pointList.get(i);
            path.lineTo(point.getX(), point.getY());
        }
        path.close();
        canvas.drawBitmap(cachebBitmap, 0, 0, null);
        canvas.drawPath(path, paint);

    }

    private float cur_x, cur_y;
    private boolean isMoving;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        for (TwoPoint twoPoint : twoPoints) {
//            float a = sqrt(twoPoint.getX() - twoPoint.getX1());
        }


        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                cur_x = x;
                cur_y = y;
                Log.e("DrawTestView", "DOWN" + cur_x + "/" + cur_y);
                //构造一个区域对象，左闭右开的。
                RectF r = new RectF();
                //计算控制点的边界
                path.computeBounds(r, true);
                //设置区域路径和剪辑描述的区域
                re.setPath(path, new Region((int) r.left, (int) r.top, (int) r.right, (int) r.bottom));
                //在封闭的path内返回true 不在返回false
                isMoving = re.contains((int) event.getX(), (int) event.getY());
                Log.e("DrawTestView", "--判断点是否则范围内----" + isMoving);

                break;
            }

            case MotionEvent.ACTION_MOVE: {
                Log.e("DrawTestView", "MOVE");

                if (!isMoving)
                    break;  //return

//                path.reset();
//                path.moveTo(x, y);
//                float dx = x - cur_x;
//                float dy = y - cur_y;
//                Log.e("DrawTestView", "UP" + dx + "/" + dy);
//
//                List<Point> newPointList = new ArrayList<>();
//                for (Point point : pointList) {
//                    float newX = point.getX() + dx;
//                    float newY = point.getY() + dy;
//                    Point newPoint = new Point(newX, newY);
//                    newPointList.add(newPoint);
//                }
//                pointList.clear();
//                pointList.addAll(newPointList);

                break;
            }

            case MotionEvent.ACTION_UP: {
                if (!isMoving)
                    break;  //return
                path.reset();
                path.moveTo(x, y);
                float dx = x - cur_x;
                float dy = y - cur_y;
                Log.e("DrawTestView", "UP" + dx + "/" + dy);

                List<Point> newPointList = new ArrayList<>();
                for (Point point : pointList) {
                    float newX = point.getX() + dx;
                    float newY = point.getY() + dy;
                    Point newPoint = new Point(newX, newY);
                    newPointList.add(newPoint);
                }
                pointList.clear();
                pointList.addAll(newPointList);
                break;
            }
        }

        // 通知刷新界面
        invalidate();

        return true;
    }


}
