package JavaOOP.person;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String Model;
    private double fuelAmount;
    private double fuelForKilometer;
    private double drivingDistance;

    public Car() {

    }

    public Car(String model, double fuelAmount,
               double fuelForKilometer, double drivingDistance) {
        this.Model = model;
        this.fuelAmount = fuelAmount;
        this.fuelForKilometer = fuelForKilometer;
        this.drivingDistance = drivingDistance;

    }

    public Car(String model, double fuelAmount,
               double fuelForKilometer) {
        this.Model = model;
        this.fuelAmount = fuelAmount;
        this.fuelForKilometer = fuelForKilometer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelForKilometer() {
        return fuelForKilometer;
    }

    public void setFuelForKilometer(double fuelForKilometer) {
        this.fuelForKilometer = fuelForKilometer;
    }

    public double getDrivingDistance() {
        return drivingDistance;
    }

    public void setDrivingDistance(double drivingDistance) {
        this.drivingDistance = drivingDistance;
    }

    public boolean hasEnoughFuel() {
        if (this.fuelAmount >= this.fuelForKilometer * this.drivingDistance) {
            driving();
    return true;
        } else {
            return false;
        }
    }

    public void driving() {
        drivingDistance = getDrivingDistance() + this.drivingDistance;

    }
}
