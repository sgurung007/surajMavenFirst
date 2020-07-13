package org.testNgSuraj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoTestCase {
    @Test
    public void TwoCaseOne() {
        System.out.println("printing from the TwoCaseOne");
    }

    @Test
    public void TwoCaseTwo() {
        System.out.println("printing from the TwoCaseTwo");
        Assert.fail("This is failed by Suraj");
    }

}
