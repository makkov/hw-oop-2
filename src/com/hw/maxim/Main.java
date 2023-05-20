package com.hw.maxim;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car");
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        System.out.println();

        System.out.println("Truck");
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        System.out.println();

        System.out.println("Bicycle");
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        System.out.println();

//        System.out.println("Service station");
        ServiceStation station = new ServiceStation();
//        station.check(car);
//        station.check(car2);
//        station.check(bicycle);
//        station.check(bicycle2);
//        station.check(truck);
//        station.check(truck2);

        station.util(car);
        station.util(bicycle);
        station.util(truck);
    }
}
