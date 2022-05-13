package fr.m2i;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(90);
        car.setGasConsumption(5.5f);
        car.setCurrentGas(50);

        try {
            car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}