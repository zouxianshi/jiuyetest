package store.Entity;

import java.io.Serializable;

public class Phone implements Serializable {
    private String color;
    private String model;
    private float size;
    private float price;

    public Phone() {

    }


    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public float getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
