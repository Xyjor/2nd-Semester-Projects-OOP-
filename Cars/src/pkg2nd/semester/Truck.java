/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2nd.semester;

/**
 *
 * @author YANGYANG_CpE121
 */
public class Truck extends Vehicle {

    private double payLoadCapacity;

    public Truck(String make, String model, double rentalPrice, double payLoadCapacity) {
        super(make, model, rentalPrice);
        this.payLoadCapacity = payLoadCapacity;
    }

    public void displayDetails() {
        super.displaydetails();
        System.out.println("Payload Capacity: " + payLoadCapacity + " tons");
    }

}
