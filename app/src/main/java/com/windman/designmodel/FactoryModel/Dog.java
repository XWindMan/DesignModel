package com.windman.designmodel.FactoryModel;

import android.util.Log;

/**
 * 2017/6/6.
 */

public class Dog implements Animal {

    private static final String TAG = "Dog";

    @Override
    public void jiao() {
        Log.d(TAG, "jiao: 汪汪汪");
    }
}
