package Buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("nhap n: ");
            n = sc.nextInt();
        }while (n <= 0);

        int[] arr = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];

        for(int i : arr){
            if(min > i)
                min = i;

            if(max < i)
                max = i;

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
