package org.example.util.mathutil.core;

public class MathUtility {
    //CLASS NAY DUNG DE CUNG CAP CAC HAM TINH TOAN TOAN HOC
    // BAT CHUOC HAM MATH TRONG JDK
    //VI NHUNG TINH TOAN NAY KO CAN LUU TRU NEN TA THIET KE STATIC
    //quy uoc 0! = 1, ko co giai thua <0 vd -5! ko hop le
    //chi den 20!
    public static long getFactorial(int n) {
        long result = 1;
        if(n==0){
            return 1;
        }
        if(n>=21||n<0){
            throw new IllegalArgumentException("n must be between 0 and 21");
        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
