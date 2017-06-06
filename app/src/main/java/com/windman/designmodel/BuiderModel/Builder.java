package com.windman.designmodel.BuiderModel;

import com.windman.designmodel.FactoryModel.Animal;
import com.windman.designmodel.FactoryModel.Cat;
import com.windman.designmodel.FactoryModel.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * 2017/6/6.
 */

public class Builder {

    private List<Animal> animals = new ArrayList<>();

    public void createDogs(int count) {
        for (int i = 0; i < count; i++) {
            animals.add(new Dog());
        }
    }

    public void createCats(int count) {
        for (int i = 0; i < count; i++) {
            animals.add(new Cat());
        }
    }
}
