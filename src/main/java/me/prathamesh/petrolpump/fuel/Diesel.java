package me.prathamesh.petrolpump.fuel;

public class Diesel extends Fuel{

    protected Diesel(double price, double quantity) {
        super(price, quantity);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getQuantity() {
        return this.quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
