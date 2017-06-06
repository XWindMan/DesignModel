package com.windman.designmodel.FactoryModel;

/**
 * 2017/6/6.
 */

public class DogFactory implements AnimalCreater {

    @Override
    public Animal creatAnimal() {
        return new Dog();
    }
}
