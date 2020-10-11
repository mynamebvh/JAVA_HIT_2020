package Bai5;

import java.sql.SQLOutput;

public class RunMan {
    public static void main(String[] args) {
        Guns Hoang = new Guns("Hoang", 1000);
        Guns Thuan = new Guns("Thuan",50);


        while(Hoang.getAmmoNumber() > 0 && Thuan.getAmmoNumber() > 0){
            Hoang.Shoot(5);
            Thuan.Shoot(50);
        }

        if(Hoang.getAmmoNumber() == 0){
            System.out.println("Hoàng hết đạn nhưng Hoàng bất tử");
        }
        else{
            System.out.println("Con gà Thuận");
        }
    }
}

