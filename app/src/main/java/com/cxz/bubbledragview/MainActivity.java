package com.cxz.bubbledragview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cxz.bubbledragview.view.BubbleDragView;

public class MainActivity extends AppCompatActivity implements BubbleDragView.OnBubbleStateListener{

    private static final String TAG = MainActivity.class.getName();

    private BubbleDragView mBubbleDragView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBubbleDragView = (BubbleDragView) findViewById(R.id.bubbleDragView);
        mBubbleDragView.setText("99+");
        mBubbleDragView.setOnBubbleStateListener(this);

    }

    public void doReCreate(View view){
        mBubbleDragView.reCreate();
    }

    @Override
    public void onDrag() {
        Log.i(TAG,"拖拽气泡");
    }

    @Override
    public void onMove() {
        Log.i(TAG,"移动气泡");
    }

    @Override
    public void onRestore() {
        Log.i(TAG,"气泡恢复原来的位置");
    }

    @Override
    public void onDismiss() {
        Log.i(TAG,"气泡消失");
    }
}
