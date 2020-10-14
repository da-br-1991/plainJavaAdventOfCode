package de.experienceOfJava.days;

import de.experienceOfJava.service.inout.ArrayListReaderService;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by dennisjeschke at 06.10.20
 */
public class Day3 implements Day {
    /**
     * working with movements in day 3 we need to find the point, two wires are crossing
     */
    // read input
    public static void calculate() {
        ArrayListReaderService readerService = new ArrayListReaderService();
        String path = "src/de/experienceOfJava/resource/day3.txt";
        ArrayList<String> day3Input;
        try {
            day3Input = readerService.readLinesInArrays(path);
            // separate 2 String-Lines
            Long x1 = null;
            Long y1 = null;
            Long x2 = null;
            Long y2 = null;
            for (String inputLine: day3Input) {
                // calc movement
                // separate inputLine by ","
                String[] movements = inputLine.split(",");
                // do more calculation stuff to convert it into movements
                for(String movement : movements) {
                    //array: input(zeilen(operatoren))
                }
            }

            //TODO Continue here!!!

        } catch (IOException e) {
            // TODO: Refactor to Log Print
            e.printStackTrace();
        }
    // convert to movement coordinates (x-y)
        // find line intersection
    // calculate manhattan distance

    }

}