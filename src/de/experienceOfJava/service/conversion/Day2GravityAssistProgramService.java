package de.experienceOfJava.service.conversion;

import java.util.List;

/**
 * @author Da-Br-1991
 */
public class Day2GravityAssistProgramService {
    /**
     * Once you have a working computer, the first step is to restore the gravity assist program (your puzzle input) to the "1202 program alarm"
     * state it had just before the last computer caught fire. To do this, before running the program, replace position 1 with the value 12 and
     * replace position 2 with the value 2.
     **/

    public static void gravityAssistProgram(List<String> day2Split, String s) {
        String half1 = s.substring(0,2);     // String s split up in halfs - half1
        String half2 = s.substring(2,4);     // String s split up in halfs - half2
        int h1 = Integer.parseInt(half1);       // convert to int - e.g. eliminates the zero in 02 to 2
        int h2 = Integer.parseInt(half2);       // convert to int  - e.g. eliminates the zero in 05 to 5

        day2Split.set(1, String.valueOf(h1));     // replace position 1 with 12
        day2Split.set(2, String.valueOf(h2));      // replace position 2 with 2
    }
}