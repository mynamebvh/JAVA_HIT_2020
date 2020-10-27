package Bai3;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private int donGia;

    public SanPham(){};

    public SanPham(String maSP, String tenSP, int soLuong, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void InputDate(){

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap MaSP: ");
        this.maSP = sc.nextLine();
        System.out.println("nhap TenSP: ");
        this.tenSP = sc.nextLine();
        System.out.println("nhap so luong: ");
        this.soLuong = sc.nextInt();
        System.out.println("nhap don gia: ");
        this.donGia = sc.nextInt();
    }

    public void OutputDate(){
        System.out.println("MaSP: " + this.maSP);
        System.out.println("TenSP: " + this.tenSP);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Don gia" + this.donGia);
    }


}
