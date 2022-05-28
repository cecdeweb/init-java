package fr.m2i;

public abstract class Vehicle {

    protected float currentGas;
    protected float gasCapacity;
    protected float gasConsumption;
    protected int speed;
    protected int passengerCapacity;

    public Vehicle(){};

    public Vehicle(float gasCapacity, int passengerCapacity) {
        if (gasCapacity > 0 && passengerCapacity > 0) {
            this.gasCapacity = gasCapacity;
            this.passengerCapacity = passengerCapacity;
        }
    }

    public abstract void accelerate();

    public abstract void brake();

    public void refuel() {
        currentGas = gasCapacity;
    }
    // Je suis partie sur cette façon de faire pour le drive
    // Je vous encourage a essayer de faire quelque chose de plus intelligent ;)
    public void drive() throws Exception {

        if (currentGas < gasConsumption) {
            throw new Exception("Pas assez d'essence !");
        }

        accelerate();

        float consumption = (gasConsumption * speed) / 100;

        currentGas -= (gasConsumption * speed) / 100;

        System.out.println(String.format("Le véhicule a consommé : %.2f L", consumption));
    }

    public float getCurrentGas() {
        return currentGas;
    }

    public void setCurrentGas(float currentGas) {
        this.currentGas = currentGas;
    }

    public float getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(float gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(float gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public void showStats() {
        String stats = "Current Gas : %.1f\nGas capacity : %.1f\nGas consumption : %.1f\nPassenger capacity : %d\nSpeed : %d\n";
        System.out.print(String.format(stats, currentGas, gasCapacity, gasConsumption, passengerCapacity, speed));
    }

}