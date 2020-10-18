package Bai2;

import java.util.Scanner;

public class NhanSu {
    private String Manhansu;
    private String Hoten;
    private Date NS;

    public NhanSu(){}

    public String getManhansu() {
        return Manhansu;
    }

    public void setManhansu(String manhansu) {
        Manhansu = manhansu;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public Date getNS() {
        return NS;
    }

    public void setNS(Date NS) {
        this.NS = NS;
    }

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma nhan su: ");
        Manhansu = sc.nextLine();
        System.out.println("nhap ho ten: ");
        Hoten = sc.nextLine();
        NS = new Date();
        NS.NHAP();
    }

    public void Xuat(){
        System.out.print("Ma nhan su: " + this.Manhansu);
        System.out.println("Ho ten: " + this.Hoten);
        NS.XUAT();
    }
}
