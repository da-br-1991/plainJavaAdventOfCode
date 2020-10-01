package de.experienceOfJava.service.conversion;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Da-Br-1991
 */
public class ArrayListSplitter {
    /**
     * String nach jedem Komma als Array separiert
     * @param day2Input
     * @return separierte Strings in einer Liste
     */
    public static List<String> splitter(ArrayList<String> day2Input) {
        String a = day2Input.get(0);                                        // Create String from day2input position 0
        List<String> day2SeparatedList = Arrays.asList(a.split(",")); // String split after every comma
        return day2SeparatedList;
    }
}
