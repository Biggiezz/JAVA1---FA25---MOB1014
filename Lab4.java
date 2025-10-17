package lab4;


public class Lab4 {

    public static void main(String[] args) {
        System.out.println("LAB4 - Bài 1");
    //bai 1
        Lab4_SanPham sanpham1 = new Lab4_SanPham("Bánh", 30000.0);
        Lab4_SanPham sanpham2 = new Lab4_SanPham();
        
    //bai 2
        sanpham1.output();
        sanpham1.input();
        sanpham2.input();
        sanpham1.output();
        sanpham2.output();
        
     //bai 3    
     Lab4_SanPham sanpham3 = new Lab4_SanPham("SP3", 10000);
     sanpham3.output();
    }
}
