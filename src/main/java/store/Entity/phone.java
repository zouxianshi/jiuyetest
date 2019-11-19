package store.Entity;

public class phone {
    private String color;
    private String model;
    private int size;
    private float price;

    public phone() {

    }

    public phone(String model, String color, int size, float price) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public int getSize() {
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
