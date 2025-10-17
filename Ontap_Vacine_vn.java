package final_asm;

public class Ontap_Vacine_vn extends Ontap_Vacine {

    String QuocGia;

    public Ontap_Vacine_vn(String vN01, String nano, float par, String string, String vietNam) {
    }

    public Ontap_Vacine_vn(String QuocGia, String MaVC, String TenVC, float ThoiGianTacDung, String NgayHetHan) {
        super(MaVC, TenVC, ThoiGianTacDung, NgayHetHan);
        this.QuocGia = QuocGia;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("Quoc Gia", QuocGia);
    }

}
