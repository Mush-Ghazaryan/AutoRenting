package com.training;

import java.util.Arrays;

public class CostsPerCars {
    private  int index;
    public static double totalRentingPrice;

    public void calculatingCarsCost() {

        lookingForIndex();
        calculatingCost();
    }


    private int lookingForIndex() {
        index = Arrays.asList(MasterClass.carsList).indexOf(MasterClass.car);
        return index;
    }

    private void calculatingCost() {
        int fuelPricePerLiter = 1;

        totalRentingPrice = Math.round((MasterClass.cost[index] * MasterClass.rentingTime) + (fuelPricePerLiter * FuelStation.fuelCharging));
        System.out.println("Total renting price for Ferrari is: " + totalRentingPrice + "$");
        System.out.println("In which  Fuel charging cost is: " + fuelPricePerLiter * FuelStation.fuelCharging + "$");

    }
}
