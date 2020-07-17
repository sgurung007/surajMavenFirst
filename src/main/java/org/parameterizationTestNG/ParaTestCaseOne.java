package org.parameterizationTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParaTestCaseOne {
    @DataProvider(name = "dp")
    public Object[][] dataProvider() {
        Object[][] objects = new Object[3][2];
        objects[0][0] = "x1";
        objects[0][1] = "y1";
        objects[1][0] = "x2";
        objects[1][1] = "y2";
        objects[2][0] = "x3";
        objects[2][1] = "y3";
        objects[2][1] = "y3";
        return objects;


    }

    @Test(dataProvider = "dp")
    public void displayNames(String firstName, String lastName) {
        System.out.println("First name: " + firstName + " Last name: " + lastName);
    }
}
