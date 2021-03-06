package com.cxz.bubbledragview.view;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/**
 * Created by chenxz on 2017/2/28.
 *
 * PointF动画估值器
 */
public class PointFEvaluator implements TypeEvaluator<PointF> {
    @Override
    public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
        float x = startValue.x + fraction * (endValue.x - startValue.x);
        float y = startValue.y + fraction * (endValue.y - startValue.y);
        return new PointF(x, y);
    }
}
