package final_asm;

public class Ontap_Vacine {

    private String MaVC;
    private String TenVC;
    private float ThoiGianTacDung;
    private String NgayHetHan;

    public Ontap_Vacine() {
    }

    public Ontap_Vacine(String MaVC, String TenVC, float ThoiGianTacDung, String NgayHetHan) {
        this.MaVC = MaVC;
        this.TenVC = TenVC;
        this.ThoiGianTacDung = ThoiGianTacDung;
        this.NgayHetHan = NgayHetHan;
    }

    public String getMaVC() {
        return MaVC;
    }

    public void setMaVC(String MaVC) {
        this.MaVC = MaVC;
    }

    public String getTenVC() {
        return TenVC;
    }

    public void setTenVC(String TenVC) {
        this.TenVC = TenVC;
    }

    public float getThoiGianTacDung() {
        return ThoiGianTacDung;
    }

    public void setThoiGianTacDung(float ThoiGianTacDung) {
        this.ThoiGianTacDung = ThoiGianTacDung;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public void inThongTin() {
        System.out.printf("MaVC:      ", MaVC);
        System.out.printf("TenVc:      ", TenVC);
        System.out.printf("MaVC:      ", ThoiGianTacDung);
        System.out.printf("MaVC:      ", NgayHetHan);

    }
    

}
