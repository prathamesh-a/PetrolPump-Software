package me.prathamesh;

import me.prathamesh.Fuel.Diesel;
import me.prathamesh.Fuel.Petrol;

public class Main {

    public Petrol petrol;
    public Diesel diesel;
    private console console;

    public void init() {
	    this.petrol = new Petrol(75);
	    this.diesel = new Diesel(60);
	    this.console = new console(this);
        run();
    }

    public void run(){
        console.print("Welcome to Petrol Pump!\nSelect the fuel type: (Petrol/Diesel)");
        console.process(console.sc.next().toLowerCase());
    }

    public static void main(String[] args){
        Main main = new Main();
        main.init();
    }
}
