package com.hw.maxim;

public class ServiceStation {


/*
    вариант с перегрузкой:
    public void check(Bicycle bicycle) {
        bicycle.doService();
    }

    public void check(Car car) {
        car.doService();
    }

    public void check(Truck truck) {
        truck.doService();
    }
*/

    public void check(Serviceable serviceable) {
        serviceable.doService();
    }
}
