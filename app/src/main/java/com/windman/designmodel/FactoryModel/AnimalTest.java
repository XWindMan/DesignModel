package com.windman.designmodel.FactoryModel;

/**
 * 2017/6/6.
 */

public class AnimalTest {

    public static void main(String[] args) {
        AnimalCreater creater = new DogFactory();
        Animal dog = creater.creatAnimal();
        dog.jiao();

        creater = new CatFactory();
        Animal cat = creater.creatAnimal();
        cat.jiao();
    }
}
