package Bai4;

import java.util.Scanner;

public class QuanLy {
    private String Maql;
    private String Hoten;

    public QuanLy(){};

    public String getMaql() {
        return Maql;
    }

    public void setMaql(String maql) {
        Maql = maql;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma quan ly: ");
        Maql = sc.nextLine();
        System.out.print("Nhap vao ho ten: ");
        Hoten = sc.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma quan ly: " + Maql);
        System.out.println("Ho ten: " + Hoten);
    }
}
