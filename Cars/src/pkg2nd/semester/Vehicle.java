/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2nd.semester;

/**
 *
 * @author YANGYANG_CpE121
 */
public class Vehicle {

    protected String make, model;

    protected double rentalPrice;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;

    }

    public void displaydetails() {
        System.out.println("Vehicl Details: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental price per day: " + rentalPrice);
    }

    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }

}
