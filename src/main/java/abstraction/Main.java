package abstraction;

public class Main {
    public static void main(String[] args){
        // abstract =  abstract classes cannot be instantiated, but they can have a subclass.
        //          abstract methods are declared without an implementation

        //Vehicle vehicle = new vehicle(); cant do this, creates a lair of security
        Car car = new Car();
        car.go();
    }
}
