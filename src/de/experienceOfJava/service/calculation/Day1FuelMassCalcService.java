package de.experienceOfJava.service.calculation;

import java.util.ArrayList;

public class Day1FuelMassCalcService {
    private ArrayList<String> result;
    public Long moduleFuelMass(ArrayList<String> result){
        Long fuelMassModule = 0L;
        setArrayList(result);

        for (int i = 0; i < result.size(); i++) {
            fuelMassModule += (Long.parseLong(result.get(i)) / 3) - 2;
        }
        return fuelMassModule;
    }
    public void setArrayList(ArrayList<String> result){
        this.result = result;
    }

    public ArrayList<String> getArrayList() {
        return result;
    }
}
