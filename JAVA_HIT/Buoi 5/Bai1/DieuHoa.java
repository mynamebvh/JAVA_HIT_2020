package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private int congSuat;
    private int giaBan;

    public DieuHoa() {
    };

    public DieuHoa(String maSP, String tenSP, String tenHang, int ngayNhap, int congSuat, int giaBan) {
        super(maSP, tenSP, tenHang, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("nhap cong suat: ");
        this.congSuat = sc.nextInt();
        System.out.println("nhap gia: ");
        this.giaBan = sc.nextInt();
    }

    @Override
    public String toString() {
        return "DieuHoa{" + super.toString() +
                "congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                '}';
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getTenSP(){
        return super.getTenHang();
    }


}
