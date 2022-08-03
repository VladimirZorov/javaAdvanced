package JavaOOP.EncapsulationExercises.ClassBox;

public class Box {

    private double lenght;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLenght(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setLenght(double length) {
        if (isPositive(length)) {
            this.lenght = length;
        }
    }

    public void setWidth(double width) {
        if (isPositive(width)) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (isPositive(height)) {
            this.height = height;
        }
    }

    private boolean isPositive(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be bigger than zero");
        }
        return number > 0;
    }

    public double calculateSurfaceArea() {
        return 2 * this.lenght * this.width + 2 * this.lenght * this.height
                + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
        return  2 * this.lenght * this.height + 2 * this.width * this.height;
    }

    public double calculateVolume() {
        return this.lenght * this.height * this.width;
    }
}
