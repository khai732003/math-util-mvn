package com.khaiphan.mathutil.core;

//class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho
//các nơi khác
//cái gì mà dùng chung cho nhiều nơi, nhận info,trả về về info qua
//hàm, mà ko cần lưu trữ gì hết, cái đó nên là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS.
//KO BH GỌI STATIC QUA CON ĐƯỜNG NEW!!!!!!!
public class MathUtility {
    public static final double PI = 3.14;
    //C: public const double Pi = 3.14 //ko cần chữ static mà vẫn là 
                                        //static nếu có từ khóa const
                                        //const C# ~ final java
    
    //hàm tính n! = 1.2.3...n
    //KO CÓ GIAI THỪA CỦA SỐ ÂM, N < 0 KO TÍNH ĐC
    //NẾU N QUÁ LỚN THÌ TRÀN KIỂU LONG, LONG CHỈ CHỊU ĐC 18 SỐ 0
    //20! VƯAD ĐỦ 18 SỐ 0, DO ĐÓ: KO TÍNH GIẢI THỪA TỪ 21 TRỞ ĐI
    //0! = 1! = - QUY ƯỚC
    public static long getFactorial(int n) {
        
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if(n == 0 || n == 1)
            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay
        
//        //sống só đến chỗ này, sure n = 2..20. Vì nếu ko chết dọc đường ở
//        //2 cụm if ở trên rồi, KO CẦN ELSE NẾU TRC ĐÓ XÀI RETURN
//        long result = 19; //giai thừa khởi đầu là 1
//        //cố tình làm code màu đỏ, vì 2! vì lúc này 2! là 20 , 3! là 60.
//        //nhân 10 lần nr.
//        //nhân dồn 2 3 4 5 ...n n vòa biến này thì thành n! 
//        
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
        return n * getFactorial(n - 1 );
    }
}

//ĐỆ QUY - RECURSION
//BÚP BÊ NGA - ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
//              NHỎ ĐẾN 1 MỨC THÌ DỪNG LẠI
//5! = 1.2.3.4  .5
//5! =   4!   X 5 = 5 X 4!
//4! = 1.2.3.4
//4! = 3! X  4  ĐUỔI NGAY
//3! = 2! X  3
//2! = 1! X  2 DỪNG NGAY
//N!   = N X (N - 1)!!!!!

//KĨ THUẬT KIỂM HÒI QUY - REGRESSION TEST
//TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST ĐỂ XÁC NHẬN NÓ CÒN CÓ ỔN KO
//TẠI SAO PHẢI TEST LẠI ???
//CODE THEO THỜI GIAN SẼ CÓ THAY ĐỔI, THAY ĐỔI VÌ
//1. ANH EM FIX BUG, SẼ SỬA CODE
//2. ANH EM TÔÍ ƯU, CHỈNH SỬA CODE ĐỂ CODE ĐẸP HƠN, CHẠY TỐT HƠN
// NHANH HƠN
//3. ANH EM THÊM HÀM MỚI, METHOD MỚI

//KHI SỬA CODE,PHẢI TEST LẠI ĐỂ ĐẢM BẢO NÓ VẪN NGON, VẪN XANH
//NẾU TEST = TAY CỰC KÌ MẤT SỨC, COI CHỪNG SÁI SOT
//NẾU CÓ TEST SCRIPT, TA CHỈ VIỆC RUN, VÀ NHÌN MÀU ĐƯA RA
//NẾU MÀU XANH, CODE CHỈNH SỬA ỔN, SỬA TIẾP CHO ĐẾN KHI NÀO ỔN
//TA TEST LẠI MÀ CHỈ CẦN NHÌN MÀU -> NHANH, KHÔNG HAO SỨC, CHỈNH XÁC
//MIỄN LÀ ĐỦ TEST CASE, TEST SCRIPT

//TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST GỌI LÀ TEST HỒI QUY REGRESSION

