package com.windman.designmodel.FactoryModel;

import android.util.Log;

/**
 * 2017/6/6.
 */

public class Cat implements Animal {

    private static final String TAG = "Cat";

    @Override
    public void jiao() {
        Log.d(TAG, "jiao: 喵喵喵");
    }
}
