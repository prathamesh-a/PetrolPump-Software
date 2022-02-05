package me.prathamesh.petrolpump.fuel;

public abstract class Fuel {
    protected double price;
    protected double quantity;

    protected Fuel(double price, double quantity){
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double getPrice();
    public abstract void setPrice(double price);
    public abstract double getQuantity();
    public abstract void setQuantity(double quantity);
}
