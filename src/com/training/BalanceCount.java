package com.training;

public class BalanceCount {

    public static double balance = 2000;

    public void countingBalance() {

        calculatingBalanace();
    }

    private void calculatingBalanace() {
        balance = balance - CostsPerCars.totalRentingPrice;
        System.out.print("Your account balance after subtracting is: " + balance + "$");
    }
}
