package Bai2;

public class Dog {
    private String name;
    private int MP = 100;

    public void Input(String name){
        this.name = name;
    }

    public void ShowMP(){
        System.out.println(this.MP);
    }

    public void Bark(){
        if(this.name == null){
            System.out.print("xin lỗi bạn chưa nhập tên");
            return;
        }
        System.out.print(this.name + "gâu gâu gâu");
        this.MP -= 20;

    }
}
