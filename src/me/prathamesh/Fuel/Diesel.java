package me.prathamesh.Fuel;

public class Diesel extends Fuel{

    public Diesel(int price) {
        super(price);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
