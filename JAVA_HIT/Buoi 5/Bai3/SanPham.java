package Bai3;

import java.util.Scanner;

public class SanPham {
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private int DonGia;

    public SanPham(){};

    public SanPham(String maSP, String tenSP, int soLuong, int donGia) {
        MaSP = maSP;
        TenSP = tenSP;
        SoLuong = soLuong;
        DonGia = donGia;
    }

    public void InputDate(){

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap MaSP: ");
        this.MaSP = sc.nextLine();
        System.out.println("nhap TenSP: ");
        this.TenSP = sc.nextLine();
        System.out.println("nhap so luong: ");
        this.SoLuong = sc.nextInt();
        System.out.println("nhap don gia: ");
        this.DonGia = sc.nextInt();
    }

    public void OutputDate(){
        System.out.println("MaSP: " + this.MaSP);
        System.out.println("TenSP: " + this.TenSP);
        System.out.println("So luong: " + this.SoLuong);
        System.out.println("Don gia" + this.DonGia);
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }
}
