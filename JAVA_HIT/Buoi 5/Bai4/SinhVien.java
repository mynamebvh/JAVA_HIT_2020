package Bai4;

import java.util.Scanner;

public class SinhVien {
    private static int i = 0;
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String name, int age, String address, double gpa) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        SinhVien.i = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void nhap(){
        i++;
        this.id = i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("nhap tuoi: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap address: ");
        this.address = sc.nextLine();
        System.out.println("nhap gpa: ");
        this.gpa = sc.nextDouble();
    }

    public void nhap1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("nhap tuoi: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap address: ");
        this.address = sc.nextLine();
        System.out.println("nhap gpa: ");
        this.gpa = sc.nextDouble();
    }
    public void format(){
        System.out.printf("%-12s%-12s%-12s%-12s%-12s","ID" ,"Name", "Age", "Address", "GPA");
        System.out.println();
    }
    public void xuat(){
        System.out.printf("%-12d%-12s%-12d%-12s%-12g", this.id , this.name, this.age, this.address, this.gpa);
        System.out.println();
    }

}
