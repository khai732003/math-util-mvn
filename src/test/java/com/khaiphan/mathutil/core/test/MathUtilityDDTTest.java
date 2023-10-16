package com.khaiphan.mathutil.core.test;
import com.khaiphan.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class MathUtilityDDTTest {
    
    //ta cần chuẩn bị bộ data để nhồi vào cái hàm qua 2 tham số
    //đã chừa sẳn!!
    //kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh
    //để data ở riêng 1 chỗ, từ từ fill vào hàm so sanh
    //kĩ thuật này gọi là DDT DATA DRIVEN TESTING
    //DATA THƯỜNG SẼ LÀ ĐẦU VÀO N, 1 CÁI LÀ ĐẦU RA EXPECTED
    //VÀ CÓ NHIỀU CẶP NHƯ THẾ
    //KĨ THUẬT NÀY CÒN GỌI LÀ THAM SỐ HÓA KIỂM THỬ
    //ĐƯA DATA VÀO QUA THAM SỐ HÀM
    
    //mảng 2 chiều này sẽ nhồi vào hàm ở dưới
   public static Object[][] initData(){
       Object[][] dataSet = {{0,1},
                            {1,1},
                            {3,6},
                            {4,24},
                            {5,120}};
       return dataSet;
   }
    
   @ParameterizedTest
   @MethodSource("initData")
        public void verifyFactorialGivenRightArumenReturnsOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
