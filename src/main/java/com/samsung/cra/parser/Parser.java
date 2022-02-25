package com.samsung.cra.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public List<Employee> parse(String input){
        String[] lines = input.split("\n");

        boolean firstLine = true;
        List<Employee> result = new ArrayList<>();
        for(String line : lines){
            if(firstLine){
                firstLine = false;
                continue;
            }
            if(line.isEmpty()) continue;
            String[] record = line.split(",");
            if("PRO".equals(record[5])){
                result.add(new Employee(record[0], record[1], record[2], record[3], record[4], record[5]));
            }
        }
        return result;
    }
}
