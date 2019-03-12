package com.gupao.lyf.factory.methodfactory;

import com.gupao.lyf.factory.ICar;

public class MethodFactoryTest {
    public static void main(String[] args) {

        MethodFactory methodFactory = new JeepFactory();
        ICar car = methodFactory.createCar();
        car.drive();
    }
}
