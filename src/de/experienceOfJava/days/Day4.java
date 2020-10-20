package de.experienceOfJava.days;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Da-Br-1991
 */
public class Day4 implements Day {
    /**
     * password generator and count passwords in a defined range
     */
    public static void calculate() {
        //input insertion
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your Input:");
        String input = scan.nextLine();
        // split one line input to both bounds
        String[] splitInput = input.split("-");
        String lowerBound = splitInput[0];
        String upperBound = splitInput[1];
        // show the upper & lower bound
        System.out.println("Your lower bound: " + lowerBound);
        System.out.println("Your upper bound: " + upperBound);
        System.out.println();
        /* part 1:
          However, they do remember a few key facts about the password:
          -It is a six-digit number.
          -The value is within the range given in your puzzle input.
          -Two adjacent digits are the same (like 22 in 122345).
          -Going from left to right, the digits never decrease; they only ever increase or stay the same (like 111123 or 135679).
          Other than the range rule, the following are true:
          - 111111 meets these criteria (double 11, never decreases).
          - 223450 does not meet these criteria (decreasing pair of digits 50).
          - 123789 does not meet these criteria (no double).
         */
        //calculation part 1
        int part1Counter = 0;
        for (int i = Integer.parseInt(lowerBound); i <= Integer.parseInt(upperBound); i++) {
            if (check1(i)) {
                part1Counter++;
            }
        }

        /*
          part 2:
          An Elf just remembered one more important detail: the two adjacent matching digits are not part of a larger group of matching digits.
          Given this additional criterion, but still ignoring the range rule, the following are now true:
          -112233 meets these criteria because the digits never decrease and all repeated digits are exactly two digits long.
          -123444 no longer meets the criteria (the repeated 44 is part of a larger group of 444).
          -111122 meets the criteria (even though 1 is repeated more than twice, it still contains a double 22).
         */
        //calculation part 2
        int part2Counter = 0;
        for (int i = Integer.parseInt(lowerBound); i <= Integer.parseInt(upperBound); i++) {
            if (check2(i)) {
                part2Counter++;
            }
        }
        //output passwordCounter
        System.out.println("Solution part 1: " + part1Counter + " (possible passwords)");
        System.out.println();
        System.out.println("Solution part 2: " + part2Counter + " (possible passwords)");
    }

    public static boolean check1(int n) {
        String str = n + "";
        //decreasing condition
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;
            }
        }
        //Two adjacent digits are the same (like 22 in 122345) condition
        if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(2) == str.charAt(3) || str.charAt(3) == str.charAt(4) ||str.charAt(4) == str.charAt(5)) {
            return true;
        }
        return false;
    }
    public static boolean check2(int n) {
        String str = n + "";
        //decreasing condition
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;
            }
        }
        //the two adjacent matching digits are not part of a larger group of matching digits condition
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] == 2) {
                return true;
            }
        }
        return false;
    }
}