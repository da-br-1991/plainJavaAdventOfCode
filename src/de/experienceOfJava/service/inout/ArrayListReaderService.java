package de.experienceOfJava.service.inout;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Da-Br-1991
 */
public class ArrayListReaderService {
    /**
     * Input-Werte aus einer txt-Datei einlesen
     * @param filepath
     * @return Input
     * @throws FileNotFoundException
     */
    public ArrayList<String> read(String filepath) throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<>();
        Scanner scan = new Scanner(new File(filepath));
        while (scan.hasNext()) {
            result.add(scan.nextLine());                // Input einlesen
        }
        return result;
    }

    /**
     * Input-Werte aus einer txt-Datei zeilenweise in ein Array einlesen
     * Je Position im Array eine Zeile
     * @param filepath
     * @return Input
     * @throws FileNotFoundException
     */
    public ArrayList<String> readLinesInArrays(String filepath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        String thisLine = null;
        ArrayList<String> result = new ArrayList<String>();
        while ((thisLine = br.readLine()) != null) {
            result.add(thisLine);
        }
        return result;
    }
}
