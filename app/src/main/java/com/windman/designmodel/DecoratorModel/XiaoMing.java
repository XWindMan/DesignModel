package com.windman.designmodel.DecoratorModel;

import android.util.Log;

/**
 * 2017/6/6.
 */

public class XiaoMing implements EatApple {
    
    private static final String TAG = "XiaoMing";
    
    @Override
    public void eat() {
        Log.d(TAG, "eat: 吃苹果 ");
    }
}
