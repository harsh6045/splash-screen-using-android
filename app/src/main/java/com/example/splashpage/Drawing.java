package com.example.splashpage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.*;
import android.view.View;

public class Drawing extends View {

    private Paint blackBrush;
    private Paint redBrush;
    private Paint yellowBrush;
    private Paint greenBrush;
    private Paint brush;
    private Paint bluebrush;
    private Paint whitebrush;
    private Bitmap bitmap;

    private LinearGradient linearGradient;
    private RadialGradient radialGradient;

    private static final int LIGHT_RADIUS = 90;
    private static final int LIGHT_MARGIN = 2 * LIGHT_RADIUS;
    private static final int BOX_WIDTH = 4*LIGHT_RADIUS;
    private static final int BOX_HEIGHT = 10*LIGHT_RADIUS;

    public Drawing(Context context) {
        super(context);
        init();
    }

    public void init(){

        blackBrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        blackBrush.setColor(Color.BLACK);

        redBrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        redBrush.setColor(Color.RED);

        yellowBrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        yellowBrush.setColor(Color.YELLOW);

        greenBrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        greenBrush.setColor(Color.GREEN);
        /*linearGradient = new LinearGradient(0, 0, 200, 200, Color.WHITE, Color.GREEN, Shader.TileMode.MIRROR);
        radialGradient = new RadialGradient(0, 0, 5, Color.RED, Color.GREEN, Shader.TileMode.MIRROR);

        brush = new Paint(Paint.ANTI_ALIAS_FLAG);
//        brush.setColor(Color.RED);
        brush.setStrokeWidth(50);
        //brush.setShader(linearGradient);
        brush.setShader(radialGradient);
        brush.setStyle(Paint.Style.STROKE);

        bluebrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        bluebrush.setColor(Color.YELLOW);
        bluebrush.setStrokeWidth(25);

        whitebrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        whitebrush.setColor(Color.WHITE);
        whitebrush.setStrokeWidth(40);

        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.images);*/


    }
    @Override
    protected void onDraw(Canvas canvas){
        int centerX = getMeasuredWidth() / 2;
        int centerY = getMeasuredHeight() / 2;
        int centerYTopLight = centerY - LIGHT_MARGIN - LIGHT_RADIUS;
        int centerYMiddleLight = centerY;
        int centerYBottomLight = centerY + LIGHT_MARGIN + LIGHT_RADIUS;

// Draw the traffic light box
        canvas.drawRect(centerX - BOX_WIDTH / 2, centerY - BOX_HEIGHT / 2,
                centerX + BOX_WIDTH / 2, centerY + BOX_HEIGHT / 2, blackBrush);

// Draw red light with a gap from the box and a gap between lights
        canvas.drawCircle(centerX, centerYTopLight, LIGHT_RADIUS, redBrush);

// Draw yellow light with a gap between lights
        canvas.drawCircle(centerX, centerYMiddleLight, LIGHT_RADIUS, yellowBrush);

// Draw green light with a gap from the box and a gap between lights
        canvas.drawCircle(centerX, centerYBottomLight, LIGHT_RADIUS, greenBrush);


        /*//canvas.drawText("Vote",getMeasuredWidth()/2,getMeasuredHeight()/2,whitebrush);
        canvas.drawCircle(getMeasuredWidth()/2, getMeasuredHeight()/2, 308f, brush);
        canvas.drawLine(0, 0, centerX, centerY, bluebrush);
        canvas.drawLine(getMeasuredWidth(), getMeasuredHeight(), centerX, centerY, bluebrush);
        canvas.drawLine(getMeasuredWidth(), 0, centerX, centerY, bluebrush);
        canvas.drawLine(0, getMeasuredHeight(), centerX, centerY, bluebrush);
        canvas.drawLine(0, getMeasuredHeight()/2, getMeasuredWidth(), getMeasuredHeight()/2, bluebrush);
        //canvas.drawBitmap(bitmap, (getMeasuredWidth()/2)-(bitmap.getWidth()/2)  , (getMeasuredHeight()/2)-(bitmap.getHeight() / 2), null);

        //canvas.drawRect(100, 500, 600, 800, brush);*/

           /* // Draw traffic light box
            canvas.drawRect(centerX - 50, centerY - 150, centerX + 50, centerY + 150, whitebrush);

            // Draw red light
            brush.setColor(Color.RED);
            canvas.drawCircle(centerX, centerY - 100, 40, brush);

            // Draw yellow light
            brush.setColor(Color.YELLOW);
            canvas.drawCircle(centerX, centerY, 40, brush);

            // Draw green light
            brush.setColor(Color.GREEN);
            canvas.drawCircle(centerX, centerY + 100, 40, brush);

            // Draw post
            canvas.drawRect(centerX - 10, centerY + 150, centerX + 10, centerY + 250, bluebrush);*/




        canvas.save();
        super.onDraw(canvas);
    }
}
