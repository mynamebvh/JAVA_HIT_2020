package Bai2;

import java.util.Scanner;

public class Date {
    private int D;
    private int T;
    private int N;

    public Date(){}

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        this.D = sc.nextInt();
        System.out.println("Nhap thang: ");
        this.T = sc.nextInt();
        System.out.println("Nhap nam: ");
        this.N = sc.nextInt();
    }

    public void XUAT(){
        System.out.println(this.D + "/" + this.T + "/" + this.N);
    }
}
