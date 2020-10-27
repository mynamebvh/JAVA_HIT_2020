package Bai2;

import java.util.Scanner;

public class SoPhuc {
    private int thuc;
    private int ao;

    public SoPhuc(){};

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan thuc: ");
        this.thuc = sc.nextInt();
        System.out.println("nhap phan ao: ");
        this.ao = sc.nextInt();
    }

    public void xuat(){
        System.out.println("phan thuc: " + this.thuc);
        System.out.println("phan ao: " + this.ao);
    }

    public SoPhuc cong(SoPhuc n){
        SoPhuc x = new SoPhuc();
        x.ao = this.ao + n.ao;
        x.thuc = this.thuc + n.thuc;
        return x;
    }

    public SoPhuc tru(SoPhuc n){
        SoPhuc x = new SoPhuc();
        x.ao = this.ao - n.ao;
        x.thuc = this.thuc - n.thuc;
        return x;
    }
    public int getThuc() {
        return thuc;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }
}
