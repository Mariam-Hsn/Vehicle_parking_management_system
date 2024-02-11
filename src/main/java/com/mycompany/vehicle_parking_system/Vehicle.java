/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle_parking_system;

/**
 *
 * @author Mariam Hsn
 */
public class Vehicle {
    
    private String id;
    private int length;
    private int moneyPerHour;    
    public Vehicle(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public long calculateParkingFee(int hoursSpent) {
        return 0;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    
    public void setMoneyPerHour(int moneyPerHour){
        this.moneyPerHour = moneyPerHour;
    }
    public int getMoneyPerHour(){
        return moneyPerHour;
    }
}
