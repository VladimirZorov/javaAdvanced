import java.util.ArrayList;
import java.util.List;

public class Car {

    private String Model;
    private double fuelAmount;
    private double fuelForKilometer;
    private double drivingDistance;
    List<String> models;

    public Car() {

    }

    public List<String> getModels() {
        return models;
    }

    public void setModels(List<String> models) {
        this.models = models;
    }

    public Car(String model, double fuelAmount,
               double fuelForKilometer, double drivingDistance) {
        this.Model = model;
        this.fuelAmount = fuelAmount;
        this.fuelForKilometer = fuelForKilometer;
        this.drivingDistance = drivingDistance;
        models = new ArrayList<String>();
    }

    public Car(String model, double fuelAmount,
               double fuelForKilometer) {
        this.Model = model;
        this.fuelAmount = fuelAmount;
        this.fuelForKilometer = fuelForKilometer;
        models = new ArrayList<String>();
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
        models.add(this.Model);
        drivingDistance = drivingDistance + this.drivingDistance;
    }
}
