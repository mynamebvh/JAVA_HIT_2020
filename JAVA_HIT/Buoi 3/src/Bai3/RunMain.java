package Bai3;


public class RunMain {
    public static void main(String[] args) {
        HangHoa hang1 = new HangHoa("MH1", "Sip", 3, 5000);
        HangHoa hang2 = new HangHoa();

        hang2.setMaHang("MH2");
        hang2.setTenHang("Ao");
        hang2.setSoLuong(3);
        hang2.setDonGia(10000);

        hang1.Xuat();

        hang2.Xuat();


    }


}
