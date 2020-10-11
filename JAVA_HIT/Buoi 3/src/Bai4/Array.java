package Bai4;

import java.util.Scanner;

public class Array {
    private int[] arr;
    private int n;


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Array(){

    }

    public Array(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        this.n = sc.nextInt();
        this.arr= new int[1000];

        for (int i = 0; i < this.n; i++){
            this.arr[i] = sc.nextInt();
        }
    }

    public void Show(){
        System.out.println("Mang vua tao: ");
        for(int i = 0 ; i < this.n ; i++) {
            System.out.println(this.arr[i] + " ");
        }
    }

    public int Sum(){
        int sum = 0;
        for(int i = 0 ; i < n ; i++)
            sum += arr[i];
        return sum;
    }


}
