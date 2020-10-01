package de.experienceOfJava.service.calculation;

import java.util.List;

/**
 * @author Da-Br-1991
 */
public class Day2OpCodeService {
    /**
     * Do OpCode based Calculation to the List until OpCode 99 exits the program
     * @param day2Split
     * @return modified day2Split List
     */
    public static List<String> day2part1Calc(List<String> day2Split) {
        int i = 0;      // start position
        while (true) {
            if (Integer.parseInt(day2Split.get(i)) != 99) {    //termination condition for int 99
                int pos1 = i;           // pos1 = opcode, termination condition for 99, addition for 1 and multiplication for 2
                int pos2 = i+1;
                int pos3 = i+2;
                int pos4 = i+3;

                if (Integer.parseInt(day2Split.get(pos1)) == 1) {
                    int value1 = Integer.parseInt(day2Split.get(Integer.parseInt(day2Split.get(pos2))));
                    int value2 = Integer.parseInt(day2Split.get(Integer.parseInt(day2Split.get(pos3))));
                    int sum = value1 + value2;
                    day2Split.set(Integer.parseInt(day2Split.get(pos4)), String.valueOf(sum));
                } else if (Integer.parseInt(day2Split.get(pos1)) == 2) {
                    int value3 = Integer.parseInt(day2Split.get(Integer.parseInt(day2Split.get(pos2))));;
                    int value4 = Integer.parseInt(day2Split.get(Integer.parseInt(day2Split.get(pos3))));;
                    int multi = value3 * value4;
                    day2Split.set(pos4, String.valueOf(multi));
                }
                i +=4;       // Step forward
            } else {
                break;
            }
        }
        return day2Split;
    }
}
