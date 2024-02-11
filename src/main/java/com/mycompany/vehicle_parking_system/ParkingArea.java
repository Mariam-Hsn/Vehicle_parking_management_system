/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle_parking_system;

import java.util.*;

/**
 *
 * @author Mariam Hsn
 */
public class ParkingArea {
    private int totalLength;
    private List<Vehicle> parkedVehicles;
    
    public ParkingArea(int totalLength) {
        this.totalLength = totalLength;
        this.parkedVehicles = new ArrayList<>(Collections.nCopies(totalLength, null));
    }
    
    public void parkVehicle(Vehicle vehicle){
        int requriedLength = vehicle.getLength();
        int startIndex = findAvailableSpace(requriedLength);
        
        if (startIndex != -1) {
            for (int i = startIndex; i < startIndex + requriedLength; i++) {
                parkedVehicles.set(i, vehicle);
            }
            System.out.println("Vehicle parked successfully.");
        } 
        else {
            System.out.println("No suitable space available for parking.");
        }
    }
    
    public void removeVehicle(String vehicleId, int hoursSpent){
        int startIndex = findVehicleIndex(vehicleId);

        if (startIndex != -1) {
            Vehicle vehicle = parkedVehicles.get(startIndex);
            long parkingFee = vehicle.calculateParkingFee( hoursSpent);

            for (int i = startIndex; i < startIndex + vehicle.getLength(); i++) {
                parkedVehicles.set(i, null);
            }

            System.out.println("Vehicle removed successfully.");
            System.out.println("Parking fee: $" + parkingFee);
        }
        else {
            System.out.println("Vehicle not found in the parking area.");
        }
    }
    
    public void printParkingStatus() {
        System.out.println("Parking Status:");
        for (int i = 0; i < parkedVehicles.size(); i++) {
            Vehicle vehicle = parkedVehicles.get(i);
            if (vehicle != null) {
                System.out.println("Space " + (i + 1) + ": " + vehicle.getId());
            } else {
                System.out.println("Space " + (i + 1) + ": Empty");
            }
        }
    }
    
    private int findAvailableSpace(int requiredLength) {
        int startIndex = -1;
        int count = 0;
        
        for (int i = 0; i < parkedVehicles.size(); i++) {
            if (parkedVehicles.get(i) == null) {
                if (startIndex == -1) {
                    startIndex = i;
                }
                count++;
                if (count == requiredLength) {
                    return startIndex;
                }
            } 
            else {
                startIndex = -1;
                count = 0;
            }
        }
        // There is no avaliable space in parking
        return -1;
    }
    
    private int findVehicleIndex(String vehicleId) {
        for (int i = 0; i < parkedVehicles.size(); i++) {
            Vehicle vehicle = parkedVehicles.get(i);
            if (vehicle != null && vehicle.getId().equals(vehicleId)) {
                return i;
            }
        }
        return -1;
    }
}
