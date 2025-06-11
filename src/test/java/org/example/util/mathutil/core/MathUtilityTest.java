package org.example.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test // @test = main => code o day run nhu main
    // bien moi test case thanh test run/ main de chay
   public void verifyFactorialGivenRightArg1() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test // @test = main => code o day run nhu main
    // bien moi test case thanh test run/ main de chay
    public void verifyFactorialGivenRightArg2() {
       assertEquals(2, MathUtility.getFactorial(2));
    }



}