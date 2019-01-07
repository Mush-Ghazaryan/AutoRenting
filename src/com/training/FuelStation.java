package com.training;
import java.util.Scanner;

public class FuelStation {

    public static int fuelCharging;

    public double calculatingMinutes() {
        Scanner input = new Scanner(System.in);
        double min = 1;
        double max = (MasterClass.rentingTime * 60);
        int random = (int) (Math.random() * max + 1);
        for (int i = 1; i <=MasterClass.rentingTime*60; i++) {
            if (i == random) {
                System.out.print("You are running out of fuel; please input how much litre to fill? ");
                fuelCharging = input.nextInt();
            } else {
                System.out.println("You are driving " + i + " " + "minutes");
            }
        }
        return fuelCharging;
    }
}
