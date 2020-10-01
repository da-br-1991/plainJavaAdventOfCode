package de.experienceOfJava;

import de.experienceOfJava.days.Day;
import de.experienceOfJava.days.day1.Day1;
import de.experienceOfJava.days.day2.Day2;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Da-Br-1991
 */
public class Main {
    /**
     * menu function - choose one day of the adventOfCode challenge and get the solution as a return
     * @param args psvm
     */
    public static void main(String[] args) {
        System.out.println("Bitte gebe eine Zahl zwischen 1 und 25 ein.");

        menuAttribute(menuCaller());
    }

    public static int menuCaller() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void menuAttribute(int chosenDay) {
        switch (chosenDay) {
            case 1:
                Day day1 = new Day1();
                try {
                    Day1.calculate();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                Day day2= new Day2();
                try {
                    Day2.calculate();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Day 3 not solved.");
                break;
            case 4:
                System.out.println("Day 4 not solved.");
                break;
            case 5:
                System.out.println("Day 5 not solved.");
                break;
            case 6:
                System.out.println("Day 6 not solved.");
                break;
            case 7:
                System.out.println("Day 7 not solved.");
                break;
            case 8:
                System.out.println("Day 8 not solved.");
                break;
            case 9:
                System.out.println("Day 9 not solved.");
                break;
            case 10:
                System.out.println("Day 10 not solved.");
                break;
            case 11:
                System.out.println("Day 11 not solved.");
                break;
            case 12:
                System.out.println("Day 12 not solved.");
                break;
            case 13:
                System.out.println("Day 13 not solved.");
                break;
            case 14:
                System.out.println("Day 14 not solved.");
                break;
            case 15:
                System.out.println("Day 15 not solved.");
                break;
            case 16:
                System.out.println("Day 16 not solved.");
                break;
            case 17:
                System.out.println("Day 17 not solved.");
                break;
            case 18:
                System.out.println("Day 18 not solved.");
                break;
            case 19:
                System.out.println("Day 19 not solved.");
                break;
            case 20:
                System.out.println("Day 20 not solved.");
                break;
            case 21:
                System.out.println("Day 21 not solved.");
                break;
            case 22:
                System.out.println("Day 22 not solved.");
                break;
            case 23:
                System.out.println("Day 23 not solved.");
                break;
            case 24:
                System.out.println("Day 24 not solved.");
                break;
            case 25:
                System.out.println("Day 25 not solved.");
                break;
            default:
                System.out.println("Wrong input! Insert a correct number!");

        }
    }
}