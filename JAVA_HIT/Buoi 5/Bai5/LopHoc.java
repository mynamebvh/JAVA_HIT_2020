package Bai5;

import java.util.ArrayList;

public class LopHoc {
    private String MaLH;
    private String TenLH;
    private int NgayMo;
    ArrayList<SinhVien> x = new ArrayList<>();
    private int n;
    private String GiaoVien;

    public LopHoc(){};

    public LopHoc(String maLH, String tenLH, int ngayMo, ArrayList<SinhVien> x, int n, String giaoVien) {
        MaLH = maLH;
        TenLH = tenLH;
        NgayMo = ngayMo;
        this.x = x;
        this.n = n;
        GiaoVien = giaoVien;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String maLH) {
        MaLH = maLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String tenLH) {
        TenLH = tenLH;
    }

    public int getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(int ngayMo) {
        NgayMo = ngayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        GiaoVien = giaoVien;
    }
}
