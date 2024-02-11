/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle_parking_system;

/**
 *
 * @author Mariam Hsn
 */
public class Car extends Vehicle {
    public Car(String id){
        super(id);
        super.setLength(5);
        super.setMoneyPerHour(10);
    }
    @Override
    public long calculateParkingFee(int hoursSpent) {
        long money = super.getMoneyPerHour() * hoursSpent;
        return money;
    }
}
