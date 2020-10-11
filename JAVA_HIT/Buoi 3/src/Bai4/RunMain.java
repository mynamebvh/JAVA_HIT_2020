package Bai4;

import org.w3c.dom.ls.LSOutput;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();

        arr1.InputData();
        arr1.Show();
        double TBC1 = arr1.Sum()*0.1 / arr1.getN();

        arr2.InputData();
        arr2.Show();
        double TBC2 = arr2.Sum()*0.1 / arr2.getN();

        if(TBC1 > TBC2){
            System.out.println(TBC1);
        }
        else if(TBC1 < TBC2){
            System.out.println(TBC2);
        }
        else{
            System.out.println("Hi");
        }

    }
}
