package com.gupao.lyf.factory.methodfactory;

import com.gupao.lyf.factory.ICar;
import com.gupao.lyf.factory.SportCar;

public class SportFatory implements MethodFactory {

    @Override
    public ICar createCar() {
        return new SportCar();
    }
}
