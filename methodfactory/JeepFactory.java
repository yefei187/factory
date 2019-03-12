package com.gupao.lyf.factory.methodfactory;

import com.gupao.lyf.factory.ICar;
import com.gupao.lyf.factory.JeepCar;

public class JeepFactory implements MethodFactory {

    @Override
    public ICar createCar() {
        return new JeepCar();
    }
}
