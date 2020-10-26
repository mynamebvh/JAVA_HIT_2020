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
        int min = pro.get(0).getGiaBan();

        for(int i = 1 ; i < n; i++){
            if(min > pro.get(i).getGiaBan()){
                min = pro.get(i).getGiaBan();
            }
        }

        System.out.println("====Loc===");
        for(int i = 0 ; i < n; i++){
            if(pro.get(i).getTenHang().equals("Electrolux") && min == pro.get(i).getGiaBan() ){
                System.out.println(pro.get(i).toString());
            }
            else{
                System.out.println("Khong ton tai");
            }
        }


    }
}
