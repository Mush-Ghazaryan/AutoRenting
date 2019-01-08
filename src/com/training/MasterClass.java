package com.training;

import java.util.Scanner;

public class MasterClass {
    public static double insurance;
    public static double rentingTime;
    private static double distanceToDrive;
    private static double speed;
    public static String car;
    final static String[] carsList = {"Ferrari", "Bugatti", "Tesla", "RX_330"};
    final static int[] cost = {100, 200, 70, 50};
    Scanner input = new Scanner(System.in);

    public void CarsList() {
        ChoosingCar();
        SelectCar();
        offeringInsurance();
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

    private void SelectCar() {

        System.out.print("Please, select a car: ");
        car = input.nextLine();

    }
    private void offeringInsurance(){
        System.out.println("Do You want to buy an insurance packet: Yes or No");
        String insAnswer = input.nextLine();
        if(insAnswer.equals("Yes")){

            insurance = cost[CostsPerCars.index];
            System.out.println("Insurance Fee for your choosen car will be:  " + " " + insurance + "$");
        } else {
            insurance = 0;
        }
    }

    private void getDistanceToDrive() {

        System.out.print("Please, select distance to drive (km): ");
        distanceToDrive = input.nextDouble();

    }

    private void getSpeedToDrive() {

        System.out.print("Please, choose speed to drive (km/h): ");
        speed = input.nextDouble();

    }

    private void calculatingRentingTime() {

        rentingTime = distanceToDrive / speed;

    }

    private void showBalance() {
        BalanceCount balanceCount = new BalanceCount();
        System.out.println("Your account balance is: " + balanceCount.getBalance() + "$");
    }
}
