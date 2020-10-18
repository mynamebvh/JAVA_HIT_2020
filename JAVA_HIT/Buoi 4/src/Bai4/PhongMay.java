package Bai4;

import java.util.Scanner;

public class PhongMay {
    private String Maphong;
    private String TenPhong;
    private int dienTich;
    private QuanLy x = new QuanLy();
    private May[] y;
    private int n;

    public PhongMay() {
    }

    ;

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String maphong) {
        Maphong = maphong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        y = new May[100];

        for (int i = 0; i < n; i++) {
            y[i] = new May();
            System.out.print("Nhap vao ma phong: ");
            Maphong = sc.nextLine();
            sc.nextLine();
            System.out.print("Nhap vao ten phong: ");
            TenPhong = sc.nextLine();
            y[i].Nhap();
            x.Nhap();
        }
    }

    public void Xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println("Ma phong: " + Maphong);
            System.out.println("Ten phong: " + TenPhong);
            y[i].Xuat();
            x.Xuat();
        }
    }
}
