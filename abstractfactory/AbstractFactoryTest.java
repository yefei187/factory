package com.gupao.lyf.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new BYDFactory();
        ISportCar sportCar = carFactory.createSport();
        sportCar.drive();
        IJeepCar jeepCar = carFactory.createJeep();
        jeepCar.drive();
    }
}
