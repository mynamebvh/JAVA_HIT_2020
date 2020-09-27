package BT1.HIT;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        int m,n;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if (i == 0 || i == n - 1){
                    System.out.print("*");
                }
                else {
                    if(j == 0 || j == m - 1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
