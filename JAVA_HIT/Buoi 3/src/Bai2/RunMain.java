package Bai2;

import Bai2.RunMain;

public class RunMain {
    public static void main(String[] args) {
        Dog Thuan = new Dog();

        Thuan.Input("Thuan");
        for(int i = 0 ; i < 3; i++){
            Thuan.Bark();
            Thuan.ShowMP();
        }

    }
}
