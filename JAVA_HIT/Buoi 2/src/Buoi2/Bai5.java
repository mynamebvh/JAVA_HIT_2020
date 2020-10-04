package Buoi2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        String str;
        int sum = 0, dem = 0;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();


        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                dem++;
                sum += Integer.parseInt(Character.toString(str.charAt(i)));
            }
        }
        System.out.println("KQ = " + sum*1.0/dem);

    }
}
