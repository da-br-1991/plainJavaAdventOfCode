package de.experienceOfJava.service.calculation;

import de.experienceOfJava.service.conversion.ArrayListSplitter;
import de.experienceOfJava.service.conversion.Day2GravityAssistProgramService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Da-Br-1991
 */

public class Day2OpCodeSearcherService {
    /**
     * OpCode Searcher for given value
     * @param day2Input String List with OpCode
     * @return Searched OpCode
     */
    public static int day2part2Calc(List<String> day2Input) {
        String part2Solution = null;
        int solCode = 0;
        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j <= 99; j++) {
                List<String> day2part2split = ArrayListSplitter.splitter((ArrayList<String>) day2Input);
                String part1 = null;
                String part2 = null;
                if (i == 0) {
                    part1 = "00";
                } else if (i >= 1 && i <= 9) {
                    part1 = "0" + i;
                } else {
                    part1 = String.valueOf(i);
                }
                if (j == 0) {
                    part2 = "00";
                } else if (j >= 1 && j <= 9) {
                    part2 = "0" + j;
                } else {
                    part2 = String.valueOf(j);
                }
                String programCode = part1 + part2;
                Day2GravityAssistProgramService.gravityAssistProgram(day2part2split, programCode);
                Day2OpCodeService.day2part1Calc(day2part2split);

                if (Integer.parseInt(day2part2split.get(0)) == 19690720) {
                    solCode = Integer.parseInt(programCode);

                }
            }
        }
        return solCode;
    }
}
