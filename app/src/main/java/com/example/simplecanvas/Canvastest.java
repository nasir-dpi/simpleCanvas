package com.example.simplecanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Canvastest extends View {
    public Canvastest(Context context) {
        super(context);
    }

    public Canvastest(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float w  = getWidth()/2;
        float h = getHeight()/2;

        Paint paint  = new Paint(Paint.ANTI_ALIAS_FLAG);
        Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(25);

        //canvas.drawPoint(w, h, paint);
        canvas.drawCircle(w,h,100,paint);


        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(2);
        canvas.drawLine(w,h,305,568,paint1);

        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(2);
        canvas.drawLine(w,h,370,550,paint2);
      /*  paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(2);
        canvas.drawLines(,5,2,paint3);*/



    }
}
