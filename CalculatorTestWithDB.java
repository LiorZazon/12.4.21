package com.company;


import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTestWithDB {

    @Test
    public void testAdd_small_numbers() {


        TestDataRepo repo = new TestDataRepo("jdbc:sqlite/D:/Users/ליאור/Downloads/QA course/JAVA/SQL/targil12.4.db");
        ArrayList<TestDataPOJO> methodData =
                repo.select("SELECT * FROM testdata where NAME = 'testAdd_small_numbers'");
        Calculator calc = new Calculator();

        for (TestDataPOJO one_row : methodData) {
            double actual_result = calc.add(one_row.input1, one_row.input2);
            assertEquals(one_row.result1, actual_result);
        }
    }


    @Test
    public void testDiv_by_zero_exception() {


        TestDataRepo repo = new TestDataRepo("jdbc:sqlite/D:/Users/ליאור/Downloads/QA course/JAVA/SQL/targil12.4.db");
        ArrayList<TestDataPOJO> methodData =
                repo.select("SELECT * FROM testdata where NAME = 'testDiv_by_zero_exception'");
        Calculator calc = new Calculator();

        for (TestDataPOJO one_row : methodData) {
            double actual_result = calc.div(one_row.input1, one_row.input2);
            assertEquals(one_row.result1, actual_result);
        }
    }
}



