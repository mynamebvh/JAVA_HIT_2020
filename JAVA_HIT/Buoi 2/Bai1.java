package Buoi2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if(a > b && a > c)
            System.out.println(a + " lon nhat");
        else if(b > a && b > c) {
            System.out.println( b + " lon nhat");
        }
        else{
            System.out.println(c + " lon nhat");
        }

    }
}
