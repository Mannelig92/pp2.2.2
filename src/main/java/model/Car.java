package model;

import java.util.Collections;
import java.util.List;

public class Car {
    private String model;
    private int mark;
    private String color;

    public Car(String model, int mark, String color) {
        this.model = model;
        this.mark = mark;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark=" + mark +
                ", color='" + color + '\'' +
                '}';
    }
}
