package de.experienceOfJava.days.day1;

import de.experienceOfJava.days.Day;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import de.experienceOfJava.service.calculation.Day1FuelMassCalcService;
import de.experienceOfJava.service.inout.ArrayListReaderService;


public class Day1 implements Day {
    public static void calculate() throws FileNotFoundException {
    // Moduleinput. Alle Werte aus day1.txt in ein Array laden.
        ArrayListReaderService readerService = new ArrayListReaderService("src/de/experienceOfJava/resource/day1.txt");
        ArrayList<String> result = readerService.getArrayList();

        // Module zu benötigten Treibstoff umrechnen. Schleife - Addiere jedes Modul zum benötigten Gesantkraftstoff
        Day1FuelMassCalcService fuelService = new Day1FuelMassCalcService();
   //     Long fuelMassModule = Day1FuelMassCalcService.moduleFuelMass(result);
        }

    // Output Gesamtkraftstoff
       // System.out.println("benötigte Gesamtkraftstoffmenge für alle Module: " + fuelMassModule + " (Part One)");
        //System.out.println("benötigte Gesamtkraftstoffmenge für alle Module: " + fuelMass + " (Part Two)");

    }


