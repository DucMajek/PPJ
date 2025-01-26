import java.awt.*;

public class Car {
    private String make;
    private java.awt.Color color;

    public Car(String make, int red, int green, int blue) {
        this.make = make;
        this.color = new java.awt.Color(red, green, blue);
    }

    public String getMake() {
        return make;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString(){
        return this.make + " " + this.color;
    }
}
