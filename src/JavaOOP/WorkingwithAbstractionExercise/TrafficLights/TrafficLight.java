package JavaOOP.WorkingwithAbstractionExercise.TrafficLights;

public class TrafficLight {

    private Color currentColor;

    public TrafficLight(Color currentColor) {
        this.currentColor = currentColor;
    }

    public Color getCurrentColor() {
        return currentColor;
    }
}
