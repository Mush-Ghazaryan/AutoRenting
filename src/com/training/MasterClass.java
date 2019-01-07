package com.training;

import java.util.Scanner;
public class MasterClass {
    public static double rentingTime;
    private static double distanceToDrive;
    private static double speed;
    public static String car;
    final static String[] carsList = {"Ferrari", "Bugatti", "Tesla", "RX_330"};
    final static int[] cost = {100, 200, 70, 50};


    public void CarsList() {
        ChoosingCar();
        SelectCar();
        getDistanceToDrive();
        getSpeedToDrive();
        calculatingRentingTime();
        showBalance();
    }

    private void ChoosingCar() {
        for (int i = 0; i < carsList.length; i++) {
            System.out.println(carsList[i] + " " + cost[i] + "$");
        }
    }

    private String SelectCar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, select a car: ");
        car = input.nextLine();
        return car;
    }

    private static double getDistanceToDrive() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, select distance to drive (km): ");
        distanceToDrive = input.nextDouble();
        return distanceToDrive;
    }

    private static double getSpeedToDrive() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, choose speed to drive (km/h): ");
        speed = input.nextDouble();
        return speed;
    }

    private double calculatingRentingTime() {

        rentingTime = distanceToDrive / speed;
        return rentingTime;
    }

    private void showBalance() {
        System.out.println("Your account balance is: " + BalanceCount.balance + "$");
    }
}
