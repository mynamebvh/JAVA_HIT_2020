package Buoi2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int n, S = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("nhap n: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] a = new int [n];
        int[] prime = new int [n];
        for(int i = 0 ; i < n; i++){
            do{
                a[i] = sc.nextInt();
            }while (a[i] < 0);
        }

        arrPrime(prime,n);
        for(int j : prime){
            System.out.println(j);
        }

        for(int i = 0 ; i < n ; i++){
            S += isPrime(a[i]) ?  (a[i] + prime[i] - i ): a[i];
        }

        System.out.println("sum = " + S);


    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void arrPrime(int arr[], int n){
        int temp = 0,iPrime = 0;
        for(int i = 2 ; ; i++){
            if(isPrime(i)){
                arr[iPrime] = i;
                temp++;
                iPrime++;
            }
            if(temp == n)
                break;
        }
    }
}
