/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2nd.semester;

/**
 *
 * @author YANGYANG_CpE121
 */
public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String make, String model, double rentalPrice, int numberOfDoors) {
        super(make, model, rentalPrice);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        super.displaydetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}
