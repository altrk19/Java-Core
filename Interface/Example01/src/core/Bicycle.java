package core;

public class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;

    }

    @Override
    public void speedUp(int increment) {
        speed += increment;

    }

    @Override
    public String  horn() {
        return "bbbbbbbbbbbbb";
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
