package encaptualation;

public class Main {

    public static void main(String[] args) {
        //Encaptulation = attributes of a class will be hidden or private
        //          Can be accessed Only through methods (getters & setters)
        //          You should make attributes private if you don't have a reason  to make them

        Car car = new Car("Chaverolet","Camero", 2021);
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//        System.out.println(car.getYear());
        car.setYear(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }

}
