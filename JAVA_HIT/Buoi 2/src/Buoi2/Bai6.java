package Buoi2;

import java.util.Scanner;




public class Bai6 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();

        while(str.charAt(0) == ' '){
            str = removeCharAt(str,0);
        }
        while(str.charAt(str.length() - 1) == ' '){
            str = removeCharAt(str,str.length() - 1);
        }

        str = str.toLowerCase();

        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) == ' '){
                str = removeCharAt(str, i);
                i--;
            }
        }

        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) == ' '){
                str = removeCharAt(str, i);
                i--;
            }
        }

        str = chuanHoa(str);
        System.out.println(str);
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
    public static String chuanHoa(String str) {

        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        }
        return str;
    }
}
