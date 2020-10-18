package Bai1;

import java.util.Scanner;

public class Sach {
    private String Masach;
    private String Tensach;
    private String Nsx;
    private int Sotrang;
    private int Giatien;

    public Sach(){}

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String masach) {
        Masach = masach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String tensach) {
        Tensach = tensach;
    }

    public String getNsx() {
        return Nsx;
    }

    public void setNsx(String nsx) {
        Nsx = nsx;
    }

    public int getSotrang() {
        return Sotrang;
    }

    public void setSotrang(int sotrang) {
        Sotrang = sotrang;
    }

    public int getGiatien() {
        return Giatien;
    }

    public void setGiatien(int giatien) {
        Giatien = giatien;
    }

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sach: ");
        this.Masach = sc.nextLine();
        System.out.println("nhap ten sach: ");
        this.Tensach = sc.nextLine();
        System.out.println("nhap Nsx: ");
        this.Nsx = sc.nextLine();
        System.out.println("nhap so trang: ");
        this.Sotrang = sc.nextInt();
        System.out.println("nhap gia tien: ");
        this.Giatien = sc.nextInt();
    }


    public void Xuat(int i){
        System.out.println("thong tin sach thu " + i);
        System.out.println("Ma sach: " + this.Masach);
        System.out.println("Ten sach: " + this.Masach);
        System.out.println("Nsx: " + this.Nsx);
        System.out.println("So trang: " + this.Sotrang);
        System.out.println("Gia tien: " + this.Giatien);
    }
}


