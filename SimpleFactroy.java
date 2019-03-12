package com.gupao.lyf.factory.simplefactory;

import com.gupao.lyf.factory.ICar;
import com.gupao.lyf.factory.JeepCar;
import com.gupao.lyf.factory.SportCar;

public class SimpleFactroy {
    public static ICar createCar(String type){
        ICar car = null;
        if("Jeep".equals(type)){
            car = new JeepCar();
        }else if("Sport".equals(type)){
            car = new SportCar();
        }
        return car;
    }
}
