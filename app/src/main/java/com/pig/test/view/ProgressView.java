package com.pig.test.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;

import com.pig.test.utils.DisplayUtil;

/**
 * Created by Administrator on 2017/3/21.
 */

public class ProgressView extends View {

    private Paint mPaint;
    private Shader mShader;
    private Context context;

    public ProgressView(Context context) {
        super(context);
    }

    public ProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mPaint = new Paint();
        this.context = context;
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int centerX = getWidth()/2;
        int centerY = getHeight()/2;

        RectF rec = new RectF();
        rec.left = centerX - 400;
        rec.right = centerX + 400;
        rec.top = 100;
        rec.bottom = 115;
        this.mPaint.setColor(Color.parseColor("#15A0F5"));
        this.mPaint.setAntiAlias(true);
        mShader = new SweepGradient(centerX, centerY,
                                new int[] { Color.parseColor("#F2EB5C"),
                                            Color.parseColor("#F2EB5C"),
                                            Color.parseColor("#F2EB5C"),
                                            Color.parseColor("#F2EB5C") }, null);
        this.mPaint.setShader(mShader);
        canvas.drawRoundRect(rec,30,30,this.mPaint);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
