package com.gupao.lyf.factory.simplefactory;

import com.gupao.lyf.factory.ICar;

public class SimpleFactoryTest<main> {
    public static void main(String[] args) {
        ICar car = SimpleFactroy.createCar("Suv");
        car.drive();
    }
}
