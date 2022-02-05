package me.prathamesh.Fuel;
public class Petrol extends Fuel{

    public Petrol(int price) {
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
