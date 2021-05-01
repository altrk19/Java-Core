package core;

public interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    String horn();
    default void drive(){
        System.out.println("driving vehicle");
    }
}
