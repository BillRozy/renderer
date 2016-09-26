package com.example.ruobudylin.renderer;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class RenderView extends View {

    public RenderView(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    public RenderView(Context context){
        this(context,null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
