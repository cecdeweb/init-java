package fr.m2i;

public abstract class Vehicule {

    // attributs

    protected float currentGas; // essence actuelle
    protected float gasCapacity; // taille réservoir
    protected float gasConsumption; // consommation l/100
    protected int speed; // km
    protected int passengerCapacity; // places

    // methods

    public abstract void accelerate();
    // method abstract dont accept function
    public abstract void brake();
    public void refuel(){
        // max capacité essence véhicule
        currentGas = gasCapacity;
    }
    public void drive() throws Exception{

        if (currentGas < gasConsumption){
            throw new Exception("Pas assez d'essence !");
        }

        accelerate();

        float consumption = (gasConsumption*speed)/100;
        currentGas -= consumption;
        System.out.println(String.format("Le véhicule consomme : %f L", gasConsumption));

    }

    // getters and setters

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
}
