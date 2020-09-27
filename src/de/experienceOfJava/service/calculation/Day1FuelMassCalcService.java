package de.experienceOfJava.service.calculation;

import java.util.ArrayList;

public class Day1FuelMassCalcService {

    public Long part1FuelMass(ArrayList<String> result) {
        Long fuelMassModule = 0L;
        for (String s : result) {
            fuelMassModule += (Long.parseLong(s) / 3) - 2;
        }
        return fuelMassModule;
    }
    public Long part2FuelMass(ArrayList<String> result){
        Long fuelMass2 = 0L;
        Long sumFuel = 0L;

        // Calculation of the fuel mass depending on fuel mass per module
        for (String s : result) {
            Long a = Long.parseLong(s);
            while (true) {
                if (a > 8) {
                    a = a / 3 - 2;
                    sumFuel += a;
                } else {
                    fuelMass2 += sumFuel;
                    sumFuel = 0L;
                    break;
                }
            }
        }

        // return of the depending fuel mass
        return fuelMass2;
    }
}
