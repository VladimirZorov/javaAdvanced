package JavaAdvanced.CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand) {

    }

    public Car(String brand, String model, int horsePower) {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

}
