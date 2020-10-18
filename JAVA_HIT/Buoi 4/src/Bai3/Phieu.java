package Bai3;

import java.util.Scanner;

public class Phieu {
    private String Maphieu;
    private Hang x[];
    private int n;

    public Phieu(){};

    public String getMaphieu() {
        return Maphieu;
    }

    public void setMaphieu(String maphieu) {
        Maphieu = maphieu;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        Maphieu = sc.nextLine();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        x = new Hang[10];

        for (int i = 0; i < this.n; i++){
            x[i] = new Hang();
            x[i].Nhap();
        }
    }

    public void XUAT(){
        System.out.println("Ma phieu: " + Maphieu);
        for (int i = 0; i < n; i++){
            x[i].Xuat();
        }
    }
}
