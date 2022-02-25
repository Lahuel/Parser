package com.samsung.cra.parser;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {
    @Test
    public void testParse(){
        Parser parser = new Parser();
        String input = "employeeNumber,name,cl,phoneNumber,birthday,certi\n" +
                "69999999,SAMSUNG KIM,CL4,010-1111-2222,19501003,ADV\n" +
                "88123456,SAMSUNG LEE,CL3,010-3434-6565,19751111,PRO\n" +
                "20987654,HEUNGMIN SON,CL2,010-7788-8877,19980101,PRO\n" +
                "21000001,YEONNA KIM,CL1,010-9009-0990,20020202,EX";
        List<Employee> expected = Arrays.asList(
                new Employee("88123456", "SAMSUNG LEE", "CL3", "010-3434-6565", "19751111", "PRO"),
                new Employee("20987654", "HEUNGMIN SON", "CL2", "010-7788-8877", "19980101", "PRO"));
        List<Employee> actual = parser.parse(input);
        assertAll(
                ()->assertEquals(expected.size(), actual.size()),
                ()->assertEquals(expected.get(0).employeeNumber, actual.get(0).employeeNumber),
                ()->assertEquals(expected.get(0).name, actual.get(0).name),
                ()->assertEquals(expected.get(1).cl, actual.get(1).cl),
                ()->assertEquals(expected.get(1).phoneNumber, actual.get(1).phoneNumber),
                ()->assertEquals(expected.get(1).birthday, actual.get(1).birthday));
    }
}
