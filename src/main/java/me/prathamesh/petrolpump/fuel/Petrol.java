package me.prathamesh.petrolpump.fuel;

public class Petrol extends Fuel{

    protected Petrol(double price, double quantity) {
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
