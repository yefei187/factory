package com.gupao.lyf.factory.abstractfactory;

public class BYDFactory implements CarFactory{

    @Override
    public ISportCar createSport() {
        return new SportCar();
    }


    @Override
    public IJeepCar createJeep() {
        return new JeepCar();
    }
}
