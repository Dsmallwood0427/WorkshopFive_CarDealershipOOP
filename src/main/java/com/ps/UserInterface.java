package com.ps;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Dealership dealership;
    private static Scanner commandScanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);

    private static void init() {
        dealership = DealershipFileManager.getDealership();
    }

    public static void display() {
        init();
        showMainMenu();
    }

    public static void showMainMenu() {
        int mainMenuCommand;

        do {
          // Find vehicles within a price range
//Find vehicles by make / model
//Find vehicles by year range
//Find vehicles by color
//Find vehicles by mileage range
//Find vehicles by type (car, truck, SUV, van)
//List ALL vehicles
//Add a vehicle
//Remove a vehicle
            // - Quit

            System.out.println("What would you like to do?");
            System.out.println("1)  Find vehicles within a price range");
            System.out.println("2) Find vehicles by make / model");
            System.out.println("3) Find vehicles by year range");
            System.out.println("4) Find vehicles by color");
            System.out.println("5) Find vehicles by mileage range");
            System.out.println("6) Find vehicles by type");
            System.out.println("7) List ALL vehicles");
            System.out.println("8) Add a vehicle");
            System.out.println("9) Remove a vehicle");
            System.out.println("10) Sell/Lease a vehicle");
            System.out.println("99) Quit");
            System.out.print("Command: ");
            mainMenuCommand = commandScanner.nextInt();

            switch (mainMenuCommand) {
                case 1: findVehiclesByPriceRange();
                    break;
                case 2:findVehiclesByMakeModel();
                    break;
                case 3:findVehiclesByYearRange();
                    break;
                case 4:findVehiclesByColor();
                    break;
                case 5:findVehiclesByMileageRange();
                    break;
                case 6:findVehiclesByType();
                    break;
                case 7:listALLVehicles();
                    break;
                case 8:addAVehicle();
                    break;
                case 9:removeAVehicle();
                    break;
                case 9:sellLeaseVehicle();
                    break;
                case 99:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid command, try again");
            }

        } while (mainMenuCommand != 0);
    }

    private static void findVehiclesByPriceRange() {
    }

    private static void findVehiclesByMakeModel() {
    }

    private static void findVehiclesByYearRange() {
    }

    private static void findVehiclesByColor() {
    }

    private static void findVehiclesByMileageRange() {
    }

    private static void findVehiclesByType() {
    }

    private static void listALLVehicles() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }


    }

    private static void addAVehicle() {
        // Ask the user for details about the vehicle
       // dealership.addVehicle(vehicle);
      //DealershipFileManager.saveDealership(dealership);
    }

    private static void removeAVehicle() {
        //Ask the user for which vehicle to remove
        // dealership.removeVehicle(vehicle);
       // DealershipFileManager.saveDealership(dealership);
    }

    private static void displayVehicles() {
        System.out.printf("Make: %s, Model: %s, Year: %d, Odometer: %d",
                vehicle.getMake(),
                vehicle.getModel(),
                vehicle.getYear(),
                vehicle.getOdometer()
        );
    }
    private static void sellLeaseVehicle() {
        //Get contract info from user
    }
}