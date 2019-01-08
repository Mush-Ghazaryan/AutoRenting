package com.training;

public class BalanceCount {

    private  double balance = 2000;

    public void countingBalance() {

        calculatingBalanace();
    }

    public void setBalance( double baLance )
    {
        balance = baLance;
    }
    public double getBalance(){
        return balance;
    }
    private void calculatingBalanace() {
        balance = balance - CostsPerCars.totalRentingPrice - MasterClass.insurance;
        System.out.println("Your account balance after subtracting is: " + balance + "$");
    }


}
