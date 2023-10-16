package com.khaiphan.mathutil.core.test;

import com.khaiphan.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DLCT
 */
public class MathUtilityTest {
    
    //Test case #1: Verify getFactorial(with n = 0)
    //Steps/Procedures:
    //          1.Given n = 0
    //          2.Call/invoke getFactorial(n = 0)
    //Expected result:
    //          The method must return 1 as the result of 0! = 1
    //Status: PASSED | FAILED chờ lúc chạy hàm mới biết trạng thái đúng sai
    @Test
    public void verifyFactorialGivenRightArument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArumen1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArument5ReturnsOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
}
