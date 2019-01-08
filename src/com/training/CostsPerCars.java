package com.training;

import java.util.Arrays;

public class CostsPerCars {
    public static int index;
    public static double totalRentingPrice;

    public void calculatingCarsCost() {

        lookingForIndex();
        calculatingCost();
    }


    private void lookingForIndex() {
        index = Arrays.asList(MasterClass.carsList).indexOf(MasterClass.car);

    }

    private void calculatingCost() {
        int fuelPricePerLiter = 1;

        totalRentingPrice = Math.round((MasterClass.cost[index] * MasterClass.rentingTime) + (fuelPricePerLiter * FuelStation.fuelCharging)+MasterClass.insurance);
        System.out.println("Total renting price is: " + totalRentingPrice + "$");
        System.out.println("In which \nFuel charging cost is: " + fuelPricePerLiter * FuelStation.fuelCharging + "$");
         System.out.println("And insurance fee is: " +  MasterClass.insurance);
    }
}
