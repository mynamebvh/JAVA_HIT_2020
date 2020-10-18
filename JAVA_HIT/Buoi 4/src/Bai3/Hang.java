package Bai3;

import java.util.Scanner;

public class Hang {
    private String Mahang;
    private String Tenhang;
    private int Dongia;

    public Hang(){};

    public String getMahang() {
        return Mahang;
    }

    public void setMahang(String mahang) {
        Mahang = mahang;
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String tenhang) {
        Tenhang = tenhang;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int dongia) {
        Dongia = dongia;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        Mahang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        Tenhang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        Dongia = Integer.parseInt(sc.nextLine());

    }

    public void Xuat(){
        System.out.println("Ma hang: " + this.Mahang);
        System.out.println("Ten hang: " + this.Mahang);
        System.out.println("Don gia: " + this.Dongia);
    }
}
