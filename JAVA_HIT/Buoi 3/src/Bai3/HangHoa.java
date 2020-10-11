package Bai3;

public class HangHoa {
    private String MaHang;
    private  String TenHang;
    private int DonGia;
    private int SoLuong;

    public HangHoa(){

    }

    public HangHoa(String maHang, String tenHang, int donGia, int soLuong) {
        MaHang = maHang;
        TenHang = tenHang;
        DonGia = donGia;
        SoLuong = soLuong;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public void Xuat(){
        System.out.println("====Thông tin hàng====");
        System.out.println("Mã hàng: " + this.MaHang);
        System.out.println("Tên hàng: " + this.TenHang);
        System.out.println("Đơn giá: " + this.DonGia);
        System.out.println("Số lượng: "+ this.SoLuong);
        System.out.println("Thành tiền: " +(this.DonGia * this.SoLuong));
    }
}
