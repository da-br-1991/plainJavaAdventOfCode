package de.experienceOfJava.service.calculation;

import java.util.ArrayList;

/**
 * @author Da-Br-1991
 */
public class Day1FuelMassCalcService {
    /**
     * used algorithms to solve Day 1
     * @param result
     * @return fuelMassModule & fuelMass2
     */
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
        for (String s : result) {                   // for every string in result do the following
            Long a = Long.parseLong(s);
            while (true) {
                if (a > 8) {                        // termination condition
                    a = a / 3 - 2;
                    sumFuel += a;
                } else {
                    fuelMass2 += sumFuel;           // add sumfuel to fuelmass2
                    sumFuel = 0L;                   // reset sumfuel
                    break;
                }
            }
        }

        // return of the depending fuel mass
        return fuelMass2;
    }
}
