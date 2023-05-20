package com.hw.maxim;

public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void doService() {
        super.doService();
        checkTrailer();
    }

    @Override
    public void util() {
        System.out.println("снять колеса, распилить раму, отделить кабину");
        super.util();
    }
}
