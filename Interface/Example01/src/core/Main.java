package core;

public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        bicycle.changeGear(1);
        bicycle.speedUp(4);
        //bicycle.printStates();    //Error

        Car car = new Car();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        car.printStates();
        System.out.println(car.horn());
    }
}
