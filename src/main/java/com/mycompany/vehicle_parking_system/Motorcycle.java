/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle_parking_system;

/**
 *
 * @author Mariam Hsn
 */
public class Motorcycle extends Vehicle {
    public Motorcycle(String id){
        super(id);
        this.setLength(2);
        this.setMoneyPerHour(5);
    }
    @Override
    public long calculateParkingFee(int hoursSpent) {
        long money = this.getMoneyPerHour() * hoursSpent;
        return money;
    }
}
