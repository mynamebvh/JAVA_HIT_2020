package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    DateTime a = new DateTime();
    ArrayList <SanPham> x = new ArrayList<>();
    int n;

    public Phieu() {

    }



    public void InputPhieu(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap MaPhieu: ");
        this.maPhieu = sc.nextLine();
        System.out.println("nhap TenPhieu: ");
        this.tenPhieu = sc.nextLine();
        a.InputDate();


        for(int i = 0 ; i < n ; i++){
            SanPham p = new SanPham();
            p.InputDate();
            x.add(p);
        }


    }

    public void OutputPhieu(int n){
        System.out.println("MaPhieu: " + this.maPhieu);
        System.out.println("TenPhieu: " + this.tenPhieu);
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
