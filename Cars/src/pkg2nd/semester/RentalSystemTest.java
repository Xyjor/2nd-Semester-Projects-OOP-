/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2nd.semester;

/**
 *
 * @author YANGYANG_CpE121
 */
public class RentalSystemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Toyota", "Camry", 20, 4);
        vehicles[1] = new Truck("Ford", "F-150", 80, 2.5);
        vehicles[2] = new Motorcycle("Ninja", "Kawasaki", 120, true);

        int rentalDays = 3;

        for (Vehicle v : vehicles) {
            v.displaydetails();
            System.out.println("Rental cost for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));
            System.out.println("--------------------------");
        }
    }
}
