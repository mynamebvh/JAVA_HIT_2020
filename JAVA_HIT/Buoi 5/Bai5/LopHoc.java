package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    private String maLH;
    private String tenLH;
    private int ngayMo;
    ArrayList<SinhVien> x = new ArrayList<>();
    private int n;
    private String GiaoVien;

    public LopHoc(){};

    public LopHoc(String maLH, String tenLH, int ngayMo, ArrayList<SinhVien> x, int n, String giaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.x = x;
        this.n = n;
        GiaoVien = giaoVien;
    }

    public String getMaLH() {
        return maLH;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma lh: ");
        this.setMaLH(sc.nextLine());
        System.out.println("nhap ten lh: ");
        this.setTenLH(sc.nextLine());
        System.out.println("nhap ten ngay mo: ");
        this.setNgayMo(sc.nextInt());

        System.out.println("nhap n: ");
        this.setN(sc.nextInt());
        sc.nextLine();
        for(int i = 0 ; i < this.n; i++){
            SinhVien p = new SinhVien();
            System.out.println("nhap ma sv: ");
            p.setMaSV(sc.nextLine());
            sc.nextLine();
            System.out.println("nhap nganh: ");
            p.setNganh(sc.nextLine());
            System.out.println("nhap khoa hoc: ");
            p.setKhoaHoc(sc.nextInt());
            this.x.add(p);
            this.x.get(i).nhap();
        }
    }

    public void xuat(){
        System.out.println("ma lh: " + this.maLH);
        System.out.println("ten lh: " + this.tenLH);
        System.out.println("ngay mo: " + this.ngayMo);

        for(int i = 0; i < this.n; i++){
            this.x.get(i).xuat();
            System.out.println("Ma SV: " + this.x.get(i).getMaSV());
            System.out.println("Nganh: " + this.x.get(i).getNganh());
            System.out.println("Khoa hoc: " + this.x.get(i).getKhoaHoc());
        }
    }
    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public int getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(int ngayMo) {
        this.ngayMo = ngayMo;
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
