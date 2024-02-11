/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle_parking_system;

/**
 *
 * @author Mariam Hsn
 */
public class Bus extends Vehicle {
    public Bus(String id){
        super(id);
        super.setLength(10);
        super.setMoneyPerHour(15);
    }
    @Override
    public long calculateParkingFee(int hoursSpent) {
        long money = super.getMoneyPerHour() * hoursSpent;
        return money;
    }
}
