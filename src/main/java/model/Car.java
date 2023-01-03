package model;

public class Car {
    private String model;
    private int number;
    private String color;

    public Car(String model, int number, String color) {
        this.model = model;
        this.number = number;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
                ", number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
