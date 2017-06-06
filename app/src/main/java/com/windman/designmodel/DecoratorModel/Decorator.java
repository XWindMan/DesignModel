package com.windman.designmodel.DecoratorModel;

import android.util.Log;

/**
 * 2017/6/6.
 * 装饰者模式：
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * <p>
 * 缺点：产生过多相似的对象，不易排错！
 */

public class Decorator implements EatApple {

    private static final String TAG = "Decorator";

    private EatApple xiaoMing;

    public Decorator(XiaoMing xiaoMing) {
        this.xiaoMing = xiaoMing;
    }

    @Override
    public void eat() {
        Log.d(TAG, "eat: 洗洗更健康");
        xiaoMing.eat();
        Log.d(TAG, "eat 酸酸甜甜: ");
    }
}
