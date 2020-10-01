package de.experienceOfJava.days.day1;

import de.experienceOfJava.days.Day;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import de.experienceOfJava.service.calculation.Day1FuelMassCalcService;
import de.experienceOfJava.service.inout.ArrayListReaderService;

/**
 * @author Da-Br-1991
 */
public class Day1 implements Day {
    /**
     * Day1 calculation
     * @throws FileNotFoundException
     */
    public static void calculate() throws FileNotFoundException {
        // Input
        ArrayListReaderService readerService = new ArrayListReaderService();
        ArrayList<String> result = readerService.read("src/de/experienceOfJava/resource/day1.txt");


        // fuelmass calculation for part 1 & part 2
        Day1FuelMassCalcService fuelService = new Day1FuelMassCalcService();
        Long part1FuelMass = fuelService.part1FuelMass(result);
        Long part2FuelMass = fuelService.part2FuelMass(result);
        // Output fuelmass
        // part 1
        System.out.println("sum of needed fuelmass dependent on weight of the respectively module: " + part1FuelMass + " (solution part one)");
        // part 2
        System.out.println("sum of needed fuelmass dependent of the additonally fuelmass: " + part2FuelMass + " (solution part two)");
    }
}


