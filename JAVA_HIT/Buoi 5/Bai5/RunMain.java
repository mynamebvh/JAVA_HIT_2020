package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        LopHoc lh = new LopHoc();

        nhap(lh);
        xuat(lh);

        System.out.println("lop hoc co " + demK14(lh) +" ban khoa 14");


        System.out.println("===sap xep===");
        sort(lh);


    }

    public static void nhap(LopHoc lh){

        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ma lh: ");
        lh.setMaLH(sc.nextLine());
        System.out.println("nhap ten lh: ");
        lh.setTenLH(sc.nextLine());
        System.out.println("nhap ten ngay mo: ");
        lh.setNgayMo(sc.nextInt());

        System.out.println("nhap n: ");
        lh.setN(sc.nextInt());
        sc.nextLine();
        for(int i = 0 ; i < lh.getN(); i++){
            SinhVien p = new SinhVien();
            System.out.println("nhap ma sv: ");
            p.setMaSV(sc.nextLine());
            sc.nextLine();
            System.out.println("nhap nganh: ");
            p.setNganh(sc.nextLine());
            System.out.println("nhap khoa hoc: ");
            p.setKhoaHoc(sc.nextInt());
            lh.x.add(p);
            lh.x.get(i).nhap();
        }


    }

    public static void xuat(LopHoc lh){
        System.out.println("ma lh: " + lh.getMaLH());
        System.out.println("ten lh: " + lh.getTenLH());
        System.out.println("ngay mo: " + lh.getNgayMo());

        for(int i = 0; i < lh.getN() ; i++){
            lh.x.get(i).xuat();
            System.out.println("Ma SV: " + lh.x.get(i).getMaSV());
            System.out.println("Nganh: " + lh.x.get(i).getNganh());
            System.out.println("Khoa hoc: " + lh.x.get(i).getKhoaHoc());
        }
    }

    public static int demK14(LopHoc lh){
        int dem = 0;
        for (int i = 0 ; i < lh.x.size(); i++){
            if(lh.x.get(i).getKhoaHoc() == 14){
                dem++;
            }
        }
        return dem;
    }

    public static void sort(LopHoc lh){
        lh.x.sort((o1,o2) -> (int)(o1.getKhoaHoc() - o2.getKhoaHoc()));

        xuat(lh);

    }
}

