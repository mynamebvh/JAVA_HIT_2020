package Bai5;

import java.util.Scanner;

public class Nguoi {
    private String HoTen;
    private int NgaySinh;
    private String QueQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int ngaySinh, String queQuan) {
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        QueQuan = queQuan;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        this.HoTen = sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        this.NgaySinh = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap que quan: ");
        this.QueQuan = sc.nextLine();
    }

    public void xuat(){
        System.out.println("ho ten: " + this.HoTen);
        System.out.println("ngay sinh: " + this.NgaySinh);
        System.out.println("que quan " + this.QueQuan);
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }
}
