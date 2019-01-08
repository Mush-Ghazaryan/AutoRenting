package com.training;

import java.util.Arrays;

public class CostsPerCars {
    public int index;
    public static double totalRentingPrice;
    public static  double insurance;
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
        insurance = MasterClass.cost[index];

        if (MasterClass.insAnswer.equals("Yes")) {
            totalRentingPrice = Math.round((MasterClass.cost[index] * MasterClass.rentingTime) + (fuelPricePerLiter * FuelStation.fuelCharging) + insurance);
            System.out.println("Total renting price is: " + totalRentingPrice + "$");
            System.out.println("In which \nFuel charging cost is: " + fuelPricePerLiter * FuelStation.fuelCharging + "$");
            System.out.println("And insurance fee is: " + insurance);


        } else {
            totalRentingPrice = Math.round((MasterClass.cost[index] * MasterClass.rentingTime) + (fuelPricePerLiter * FuelStation.fuelCharging));
            System.out.println("Total renting price is: " + totalRentingPrice + "$");
            System.out.println("In which \nFuel charging cost is: " + fuelPricePerLiter * FuelStation.fuelCharging + "$");

        }
//        totalRentingPrice = Math.round((MasterClass.cost[index] * MasterClass.rentingTime) + (fuelPricePerLiter * FuelStation.fuelCharging)+MasterClass.insurance);
//        System.out.println("Total renting price is: " + totalRentingPrice + "$");
//        System.out.println("In which \nFuel charging cost is: " + fuelPricePerLiter * FuelStation.fuelCharging + "$");
//         System.out.println("And insurance fee is: " +  MasterClass.insurance);
    }
}
// System.out.println("Insurance Fee for your choosen car will be:  " + " " + insurance + "$");
//