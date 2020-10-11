package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBeDe = new Person();

        DoanXinhGai.setName("Tạ Thị Doan");
        DoanXinhGai.setDateOfBirth("20/12/2000");
        DoanXinhGai.setGender("Nữ");
        DoanXinhGai.setHobby("Thích các bạn trai mới lớn");

        DiepBeDe.setName("Nguyễn Thị Điệp");
        DiepBeDe.setDateOfBirth("17/7/2000");
        DiepBeDe.setGender("Cong 100%");
        DiepBeDe.setHobby("Những người đeo kính đều gay");


        System.out.println("Thông tin của Chị Doan ");
        System.out.println(DoanXinhGai.getName());
        System.out.println(DoanXinhGai.getDateOfBirth());
        System.out.println(DoanXinhGai.getGender());
        System.out.println(DoanXinhGai.getHobby());

        System.out.println("Thông tin của Chị Điệp");
        System.out.println(DiepBeDe.getName());
        System.out.println(DiepBeDe.getDateOfBirth());
        System.out.println(DiepBeDe.getGender());
        System.out.println(DiepBeDe.getHobby());

    }
}
