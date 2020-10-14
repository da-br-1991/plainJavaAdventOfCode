package de.experienceOfJava.days;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Da-Br-1991
 */
public class Day4 implements Day {
    /**
     * password generator and count passwords in a defined range
     */
    public static void calculate() throws Exception{
        //input insertion
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your Input:");
        String input = scan.nextLine();
        // split one line input to both bounds
        String[] splitInput = input.split("-");
        int lowerBound = Integer.parseInt(splitInput[0]);
        int upperBound = Integer.parseInt(splitInput[1]);
        // show the upper & lower bound
        System.out.println("Your lower bound: " + lowerBound);
        System.out.println("Your upper bound: " + upperBound);

        //loop to create all passwords and count every valid one


        //output passwordCounter


    }
}
