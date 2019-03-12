package com.gupao.lyf.factory.abstractfactory;

import com.gupao.lyf.factory.ICar;

public class GelyFactory implements CarFactory{

    @Override
    public ISportCar createSport() {
        return new SportCar();
    }

    @Override
    public IJeepCar createJeep() {
        return new JeepCar();
    }
}
