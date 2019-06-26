package com.windman.designmodel.ModelModel;

import android.util.Log;

/**
 * auth:Tony
 * date:2019/6/26
 * des:模板模式
 * 1.利用抽象类和抽象方法的特性，子类必须实现
 * 2.调用的函数final，维护模板执行框架
 * <p>
 * 子类实现抽象函数，负责具体实现
 * 优点
 * 模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。子类实现算法的某些细节，有助于算法的扩展。通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。
 * <p>
 * 缺点
 * 每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。
 * <p>
 * 适用场景
 * 在某些类的算法中，用了相同的方法，造成代码的重复。控制子类扩展，子类必须遵守算法规则。
 */
public abstract class FruitLoader {
    private static final String TAG = "FruitLoader";

    public final void loadName(String s) {
        Log.d(TAG, "loadName: " + getNamge(s));
    }

    protected abstract String getNamge(String name);
}
