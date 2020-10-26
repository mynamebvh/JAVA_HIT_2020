package Bai5;

public class SinhVien extends Nguoi{
    private String MaSV;
    private String Nganh;
    private int KhoaHoc;

    public SinhVien() {
    }

    public SinhVien(String maSV, String nganh, int khoaHoc) {
        MaSV = maSV;
        Nganh = nganh;
        KhoaHoc = khoaHoc;
    }

    public SinhVien(String hoTen, int ngaySinh, String queQuan, String maSV, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        MaSV = maSV;
        Nganh = nganh;
        KhoaHoc = khoaHoc;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        KhoaHoc = khoaHoc;
    }

    public String getHoTen(){
        return this.getHoTen();
    }

    public void setHoTen(String name){
        this.setHoTen(name);
    }
}
