package me.prathamesh.Fuel;

public abstract class Fuel {
    protected double price;

    protected Fuel(int price){
        this.price = price;
    }

    public abstract void setPrice(double price);
    public abstract double getPrice();
}
