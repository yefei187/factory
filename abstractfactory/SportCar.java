package com.gupao.lyf.factory.abstractfactory;

import com.gupao.lyf.factory.ICar;

public class SportCar implements ISportCar {
    @Override
    public void drive() {
        System.out.println("Sport Car is running");
    }
}
