package Bai1;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private String tenHang;
    private int ngayNhap;

    public SanPham() {
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getTenHang() {
        return tenHang;
    }

    public SanPham(String maSP, String tenSP, String tenHang, int ngayNhap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenHang = tenHang;
        this.ngayNhap = ngayNhap;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma SP: ");
        this.maSP = sc.nextLine();
        System.out.println("nhap ten SP: ");
        this.tenSP = sc.nextLine();
        System.out.println("nhap hang sx: ");
        this.tenHang = sc.nextLine();
        System.out.println("nhap ngay: ");
        this.ngayNhap = sc.nextInt();
    }


    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", ngayNhap=" + ngayNhap +
                '}';
    }
}
