package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String MaPhieu;
    private String TenPhieu;
    DateTime a = new DateTime();
    ArrayList <SanPham> x = new ArrayList<>();
    int n;

    public Phieu() {

    }

    public Phieu(String maPhieu, String tenPhieu, DateTime a, ArrayList<SanPham> x, int n) {
        MaPhieu = maPhieu;
        TenPhieu = tenPhieu;
        this.a = a;
        this.x = x;
        this.n = n;
    }

    public void InputPhieu(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap MaPhieu: ");
        this.MaPhieu = sc.nextLine();
        System.out.println("nhap TenPhieu: ");
        this.TenPhieu = sc.nextLine();
        a.InputDate();


        for(int i = 0 ; i < n ; i++){
            SanPham p = new SanPham();
            p.InputDate();
            x.add(p);
        }


    }

    public void OutputPhieu(int n){
        System.out.println("MaPhieu: " + this.MaPhieu);
        System.out.println("TenPhieu: " + this.TenPhieu);
        a.OutputDate();
        for(int i = 0 ; i < n ; i++){
            System.out.println("MaSP: " + x.get(i).getMaSP());
            System.out.println("TenSP: " + x.get(i).getTenSP());
            System.out.println("SoLuong: " + x.get(i).getSoLuong());
            System.out.println("DonGia: " + x.get(i).getDonGia());
            System.out.println("thanh tien: " + (x.get(i).getSoLuong() * x.get(i).getDonGia()));
        }
    }
}
