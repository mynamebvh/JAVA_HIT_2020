package Bai4;

import java.util.Scanner;

public class May {
    private String Mamay;
    private String Kieumay;
    private String Tinhtrang;

    public May(){};

    public String getMamay() {
        return Mamay;
    }

    public void setMamay(String mamay) {
        Mamay = mamay;
    }

    public String getKieumay() {
        return Kieumay;
    }

    public void setKieumay(String kieumay) {
        Kieumay = kieumay;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        Tinhtrang = tinhtrang;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma may: ");
        Mamay = sc.nextLine();
        System.out.print("Nhap vao kieu may: ");
        Kieumay = sc.nextLine();
        System.out.print("Nhap vao tinh trang: ");
        Tinhtrang = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma may: " + Mamay);
        System.out.println("Kieu may: " + Kieumay);
        System.out.println("Tinh trang: " + Tinhtrang);
    }
}
