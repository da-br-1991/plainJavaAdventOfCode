package de.experienceOfJava.days;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Da-Br-1991
 */
public class Day3 implements Day {
    /**
     * find the intersection point closest to the central port
     */
    public static void calculate() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("src/de/experienceOfJava/resource/day3.txt")));
        Map<String, Integer> wireMap = new HashMap<>();
        // read input and split after ","
        String[] input = r.readLine().split(",");

        int closestDistance = Integer.MAX_VALUE;
        int shortestWire = Integer.MAX_VALUE;
        int xPos = 0;
        int yPos = 0;
        int distance = 0;
        // for loop: first wire commands
        for (String s : input) {
            // get direction from command
            int[] dir = getDir(s.charAt(0));
            // get command length
            int len = Integer.parseInt(s.substring(1));
            // for every command put every x and y position and the distance into the hashmap(wire 1)
            for (int j = 0; j < len; j++) {
                assert dir != null;
                int newXPos = xPos + dir[0];
                int newYPos = yPos + dir[1];
                wireMap.put(newXPos + "_" + newYPos, ++distance);
                xPos = newXPos;
                yPos = newYPos;
            }
        }
        // read input and split after ","
        input = r.readLine().split(",");
        xPos = 0;
        yPos = 0;
        distance = 0;
        // for loop: second wire commands
        for (String s : input) {
            // get direction from command
            int[] dir = getDir(s.charAt(0));
            // get command length
            int len = Integer.parseInt(s.substring(1));
            // for every command put every x and y position and the distance(wire 2)
            for (int j = 0; j < len; j++) {

                assert dir != null;
                int newX = xPos + dir[0];
                int newY = yPos + dir[1];
                distance++;
                // check hashmap if contains intersection
                if (wireMap.containsKey(newX + "_" + newY)) {
                    closestDistance = Math.min(closestDistance, Math.abs(newX) + Math.abs(newY)); // Part 1
                    shortestWire = Math.min(shortestWire, wireMap.get(newX + "_" + newY) + distance); // Part 2
                }
                xPos = newX;
                yPos = newY;
            }
        }
        //Solution output
        System.out.println("Solution Day 3");
        System.out.println("Part 1: " + closestDistance);
        System.out.println("Part 2: " + shortestWire);
    }

    //returns direction coordinates given {L,R,U,D}
    public static int[] getDir ( char c){
        switch (c) {
            case 'U':
                return new int[]{0, 1};
            case 'D':
                return new int[]{0, -1};
            case 'L':
                return new int[]{-1, 0};
            case 'R':
                return new int[]{1, 0};
        }
        return null;
    }
}