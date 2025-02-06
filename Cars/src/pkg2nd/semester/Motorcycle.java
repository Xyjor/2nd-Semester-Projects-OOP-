/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2nd.semester;

/**
 *
 * @author YANGYANG_CpE121
 */
public class Motorcycle extends Vehicle {

    private boolean hasRentalHelmet;

    public Motorcycle(String make, String model, double rentalPrice, boolean hasRentalPrice) {
        super(make, model, rentalPrice);
        this.hasRentalHelmet = hasRentalPrice;
    }

    public void displayDetails() {
        super.displaydetails();
        System.out.println("Helmet Rental Available: " + (hasRentalHelmet ? "Yes" : "No"));
    }

}
