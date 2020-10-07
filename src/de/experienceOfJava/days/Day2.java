package de.experienceOfJava.days;

import de.experienceOfJava.days.Day;
import de.experienceOfJava.service.calculation.Day2OpCodeSearcherService;
import de.experienceOfJava.service.calculation.Day2OpCodeService;
import de.experienceOfJava.service.conversion.Day2GravityAssistProgramService;
import de.experienceOfJava.service.conversion.ArrayListSplitter;
import de.experienceOfJava.service.inout.ArrayListReaderService;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Da-Br-1991
 */
public class Day2 implements Day {
    /**
     * Day 2 calculation
      * @throws FileNotFoundException
     */
    public static void calculate() throws FileNotFoundException {
        // Input. Alle Werte aus day2.txt in ein Array laden.
        ArrayListReaderService readerService = new ArrayListReaderService();
        ArrayList<String> day2Input = readerService.read("src/de/experienceOfJava/resource/day2.txt");

        // ArrayList  day2input split after every comma
        List<String> day2Split = ArrayListSplitter.splitter(day2Input);

        //part 1 calculation:
        //Execute the gravity assist program: code 1202)
        Day2GravityAssistProgramService.gravityAssistProgram(day2Split, "1202");
        //Algorithm
        Day2OpCodeService.day2part1Calc(day2Split);

        //part 2 calculation:
        int solCode = Day2OpCodeSearcherService.day2part2Calc(day2Input);
        

        //Output solution:
        System.out.println("solution part one: " + day2Split.get(0));
        System.out.println("");
        System.out.println("solution part two: " + solCode);

    }
}
