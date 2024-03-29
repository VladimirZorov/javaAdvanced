package workingWithAbstraction.TrafficLights;


public class TrafficLight {

    private Color currentColor;

    public TrafficLight(Color cat) {
        this.currentColor = cat;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void  changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = Color.GREEN;
                break;
            case GREEN:
                currentColor = Color.YELLOW;
                break;
            case YELLOW:
                currentColor = Color.RED;
                break;
        }
    }
}
