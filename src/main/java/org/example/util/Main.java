package org.example.util;

import org.example.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
verifyFactorialGivenRightArg0RunsWell();
verifyFactorialGivenRightArg1();
verifyFactorialGivenRightArg2();
verifyFactorialGivenRightArgs();
        //test thu ham tinh gia thua goi trong main
        //muon test gi do thi phai co test case
        //TEST CASE #1 Verify the result with n = 0
        // Step 1: Given n = 0;
        //Call getFactorial(n=0)
        //Expected method return 1 as the result
        //status: PASSED or Failed


    }

    public static void verifyFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
       // System.out.printf("0! = Expected: %d, Actual: %d\n", expected, actual);
        if(expected==actual) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
    //ki thuat vua go code vua go test case/run đc goi la TDD(TEST DRIVEN DEVELOPMENT)
    public static void verifyFactorialGivenRightArg1() {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.printf( n + "! = Expected: %d, Actual: %d\n", expected, actual);
    }
    public static void verifyFactorialGivenRightArg2() {
        int n = 10;
        long expected = 2;
        long actual = MathUtility.getFactorial(n);
        System.out.printf( n + "! = Expected: %d, Actual: %d\n", expected, actual);
    }
    public static void verifyFactorialGivenRightArgs() {
        int n = 10;
        long expected = 2;

        System.out.printf( n + "! = Expected: %d, Actual: %d\n", expected, MathUtility.getFactorial(n));
    }
}