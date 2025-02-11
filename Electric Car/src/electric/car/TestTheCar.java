/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electric.car;

import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class TestTheCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ElectricCar vehi = new ElectricCar("Elon Mux", "Tesla", 95, 1500);
        System.out.print("Input the days you want to rent: ");
        int days = in.nextInt();

        vehi.displayDetails();

        System.out.println("Rental cost for " + days + " days: $" + vehi.calculateRentalCost(days));
        
        
        vehi.calculateDiscountedREntalCost(days, 0);
        System.out.println("-----------------------------------");
    }

}
