package lab4;

// contructor Phím tắt : control + i
import java.util.*;

public class Lab4_SanPham {
// bài 1
//    public String tenSanPham;
//    public String donGia;
//    public String giamGia;

// nâng cấp bài 1 thêm private (bài 4)
    private String tenSanPham;
    private Double donGia;
    private Double giamGia;

    public Lab4_SanPham(String tenSanPham, double donGia) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Lab4_SanPham(String tenSanPham, Double donGia) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Lab4_SanPham() {

    }
// bai 2

    public void input() {
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSanPham = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        this.giamGia = sc.nextDouble();

    }

    public void output() {
        System.out.printf("Tên sản phẩm: %s, Đơn giá: %.2f, Giảm giá: %.2f\n",
                tenSanPham, donGia, giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Getter/Setter Phím tắt : control + i
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }
    //bài 4: bổ sung phương thức getter/ setter

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }

}
