package com.gupao.lyf.factory.abstractfactory;

import com.gupao.lyf.factory.ICar;

public class JeepCar implements IJeepCar{
    @Override
    public void drive() {
        System.out.println("Jeep Car is running");
    }
}
