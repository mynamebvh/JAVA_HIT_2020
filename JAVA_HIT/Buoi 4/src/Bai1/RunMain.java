package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Sach book[] = new Sach[10];

        do{
            System.out.print("nhap n: ");
            n = sc.nextInt();
        }while (n < 0 || n >= 10);

        for(int i = 0 ; i < n ; i++){
            book[i] = new Sach();
            book[i].NHAP();
        }

        for(int i = 0 ; i < n ; i++){
            book[i].Xuat(i+1);
        }
    }
}
