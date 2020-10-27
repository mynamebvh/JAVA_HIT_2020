package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        ArrayList <DieuHoa> pro = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            DieuHoa p = new DieuHoa();
            p.Nhap();
            pro.add(p);
        }

        for(DieuHoa i : pro){
            System.out.println(i.toString());
        }

        int vtri = 0;
        int min = 0;
        for(int i = 0 ; i < n; i++){
            if(pro.get(i).getTenHang().equals("Electrolux")){
                min = pro.get(i).getGiaBan();
                vtri = i;
                break;
            }
        }

        System.out.println("====Loc===");
        if(vtri == 0){
            System.out.println("Khong ton tai");
        }
        else {
            for (int i = vtri; i < n; i++) {
                if (pro.get(i).getTenHang().equals("Electrolux") && min > pro.get(i).getGiaBan()) {
                    min = pro.get(i).getGiaBan();
                }
            }
        }

        for (int i = vtri; i < n; i++) {
            if (pro.get(i).getTenHang().equals("Electrolux") && min == pro.get(i).getGiaBan()) {
                System.out.println(pro.get(i).toString());
            }
        }


    }
}
