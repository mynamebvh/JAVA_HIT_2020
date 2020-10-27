package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        LopHoc lh = new LopHoc();
        lh.nhap();
        lh.xuat();
        System.out.println("lop hoc co " + demK14(lh) +" ban khoa 14");
        System.out.println("===sap xep===");
        sort(lh);
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
        lh.xuat();
    }
}

