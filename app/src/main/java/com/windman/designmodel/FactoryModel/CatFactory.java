package com.windman.designmodel.FactoryModel;

/**
 * 2017/6/6.
 */

public class CatFactory implements AnimalCreater {

    @Override
    public Animal creatAnimal() {
        return new Cat();
    }
}
