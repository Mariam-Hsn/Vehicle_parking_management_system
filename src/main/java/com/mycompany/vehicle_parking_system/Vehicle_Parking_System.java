/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.vehicle_parking_system;

import java.util.*;

/**
 *
 * @author Mariam Hsn
 */
public class Vehicle_Parking_System {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ParkingArea parkingArea = new ParkingArea(100);

        // App's Menu
        while (true) {
            System.out.println("\n---------- Vehicle Parking Management ----------");
            System.out.println("1. Park a vehicle");
            System.out.println("2. Remove a vehicle");
            System.out.println("3. Show parking status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = input.nextInt();

                switch (choice) {
                    case 1:  // add a vehicle
                        System.out.print("Enter vehicle type (Bus/Car/Motorcycle/Truck): ");
                        String type = input.next();
                        System.out.print("Enter vehicle ID: ");
                        String id = input.next();
                        Vehicle vehicle = createVehicle(type, id);
                        if (vehicle != null) {
                            parkingArea.parkVehicle(vehicle);
                        } else {
                            System.out.println("Invalid vehicle type. Please try again.");
                        }
                        break;
                    case 2:  // remove a vehicle
                        System.out.print("Enter vehicle ID: ");
                        id = input.next();
                        System.out.print("Enter number of hours spent in the parking: ");
                        int hoursSpent = input.nextInt();
                        parkingArea.removeVehicle(id, hoursSpent);
                        break;
                    case 3:  // show parking Status
                        parkingArea.printParkingStatus();
                        break;
                    case 4:  // exit from app
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                input.nextLine(); // Clear the input buffer
            }
        }
    }

    private static Vehicle createVehicle(String type, String id) {
        if ("Bus".equalsIgnoreCase(type)) {
            return new Bus(id);
        }
        if ("Car".equalsIgnoreCase(type)) {
            return new Car(id);
        }
        if ("Motorcycle".equalsIgnoreCase(type)) {
            return new Motorcycle(id);
        }
        if ("Truck".equalsIgnoreCase(type)) {
            return new Truck(id);
        }
        return null;
    }
}
