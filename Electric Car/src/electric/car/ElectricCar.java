/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electric.car;

/**
 *
 * @author Xyjor
 */
public class ElectricCar extends Vehicle {

    private double batteryCapacity;

    public ElectricCar(String make, String model, double rentalPrice, double batteryCapacity) {
        super(make, model, rentalPrice);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayDetails() {
        super.displaydetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

}
