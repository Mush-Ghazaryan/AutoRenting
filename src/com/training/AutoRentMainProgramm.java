package com.training;

public class AutoRentMainProgramm {
    public static void main(String[] args) {


        MasterClass masterClass = new MasterClass();
        masterClass.CarsList();

        FuelStation fuelStation = new FuelStation();
        fuelStation.calculatingMinutes();

        CostsPerCars costsPerCars = new CostsPerCars();
        costsPerCars.calculatingCarsCost();

        BalanceCount balanceCount = new BalanceCount();
        balanceCount.countingBalance();
    }
}
//*.iml
// .idea/*