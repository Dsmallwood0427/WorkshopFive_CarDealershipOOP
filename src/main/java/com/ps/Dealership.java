package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<com.ps.Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        this.inventory = new ArrayList<>();
    }

    public Dealership() {

    }

    public List<com.ps.Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }
    public List<com.ps.Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public List<com.ps.Vehicle> getVehiclesByYear(int year){
        return null;
    }
    public List<com.ps.Vehicle> getVehiclesByColor(String color){
        return null;
    }
    public List<com.ps.Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }
    public List<com.ps.Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }
    public List<com.ps.Vehicle> getAllVehicles(){
        return this.inventory;
    }
    public void addVehicle(com.ps.Vehicle vehicle){
        this.inventory.add(vehicle);
    }
    public void removeVehicle(com.ps.Vehicle vehicle){
        this.inventory.remove(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<com.ps.Vehicle> findByMakeModel(String rmMake, String rmModel) {
    }

    public List<com.ps.Vehicle> listAllVehicles() {
    }

    public List<com.ps.Vehicle> findByPriceRange(double minPrice, double maxPrice) {
    }

    public List<com.ps.Vehicle> findByYear(int fYear) {
    }

    public List<com.ps.Vehicle> findByColor(String fColor) {
    }

    public List<com.ps.Vehicle> findByMileageRange(int minMileage, int maxMileage) {
        return null;
    }
}