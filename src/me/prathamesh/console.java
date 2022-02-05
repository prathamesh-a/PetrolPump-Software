package me.prathamesh;

import java.util.Scanner;

public class console {
    public static Scanner sc = new Scanner(System.in);
    private final Main main;

    public console(Main main){
        this.main = main;
    }

    public static void print(String s){System.out.println(s);}

    public  void process(String fuel){
        System.out.println("Select (Quantity/Amount):");
        String temp = sc.next();
        if (fuel.equalsIgnoreCase("petrol")){

            if (temp.equalsIgnoreCase("amount")){
                print("Enter the amount:");
                double amount = sc.nextDouble();
                showDetails(amount, amount/main.petrol.getPrice());
            }
            else if (temp.equalsIgnoreCase("quantity")){
                print("Enter the quantity (in L):");
                double litre = sc.nextDouble();
                showDetails(main.petrol.getPrice()*litre, litre);
            }
        }
        else if (fuel.equalsIgnoreCase("diesel")){
            if (temp.equalsIgnoreCase("amount")){
                print("Enter the amount:");
                double amount = sc.nextDouble();
                showDetails(amount, amount/main.diesel.getPrice());
            }
            else if (temp.equalsIgnoreCase("quantity")){
                print("Enter the quantity (in L):");
                double litre = sc.nextDouble();
                showDetails(main.diesel.getPrice()*litre, litre);
            }
        }
        print("\n===========================\nSelect Option:\n1. Make another transaction.\n2. Admin panel.\n3. Exit.\n===========================");
        rerun();
    }

    private void showDetails(double sale, double litre){
        print("");
        print("");print("Details:");
        print("Sale: Rs." + sale);
        print("Litres: " + litre + "L");
        print("");
        print("Petrol: " + main.petrol.getPrice() + "/L");
        print("Diesel: " + main.diesel.getPrice() + "/L");
    }

    private void rerun(){
        switch (sc.nextInt()){
            case 1:
                main.run();
                break;
            case 2:

                break;
            case 3:
                break;
        }
    }



}
