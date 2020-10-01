package de.experienceOfJava.service.inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Da-Br-1991
 */
public class ArrayListReaderService {
    /**
     * Input-Werte aus einer txt-Datei einlesen
     * @param path txt path
     * @return Input
     * @throws FileNotFoundException wrong file or no file error
     */
    public ArrayList<String> read(String path) throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNext()) {
            result.add(scan.nextLine());                // Input einlesen
        }
        return result;
    }

}
