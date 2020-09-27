package de.experienceOfJava.service.inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReaderService {
    private ArrayList<String> result = new ArrayList<>();
    public ArrayListReaderService(String path) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNext()) {
            result.add(scan.nextLine());
        }
    }
    public ArrayList<String> getArrayList() {
        return result;
    }
}
