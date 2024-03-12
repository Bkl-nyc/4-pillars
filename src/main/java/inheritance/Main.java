package inheritance;

import inheritance.Bicycle;

public class Main {

    public static void main(String [] args) {
        //innheritance the process where one class qcquires
        // the atribute and methoids of another

        Car car = new Car();
        car.go();
        Bicycle bike = new Bicycle();
        //bike.stop
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}