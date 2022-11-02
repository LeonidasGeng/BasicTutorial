package _03Encapsulation.practice;

public class car {
    private String brand;

    private double price;

    private String color;

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
