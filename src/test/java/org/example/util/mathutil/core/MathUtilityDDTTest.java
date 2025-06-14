package org.example.util.mathutil.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MathUtilityDDTTest {
// chuẩn bị bộ data để riêng -- DD - data driven
// lát fill vào so sánh  T testing
//fill vào qua tham số hàm - hàm làm việc với nhiều data
// DDT còn gọi tên khác - parameterized test - kiểm thử tham số hóa

// bộ data nằm trong 1 hàm static - tĩnh 1 chỗ để mọi người vào lấy
// bộ data thường là 1 mảng 2 chiều [giá trị đầu vào] và [giá trị trả về]

public static Object[][] initData(){
    //mảng 1 chiều
    //int[] a= {5,10,15,20};

    return new Object[][]{
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24}
    };      //n expected
}
@ParameterizedTest
@MethodSource("initData")
public void testFactorialGivenRightArgsRunWell(int n,long expected){
    assertEquals(expected,MathUtility.getFactorial(n));
}
}