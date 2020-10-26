package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choose;
        ArrayList <SinhVien> sv = new ArrayList<>();

        sv.add(new SinhVien("hoang",19,"hn",4));
        while (true){
            System.out.print("======Danh sách chức năng======\n");
            System.out.print("1. Add friend\n2.Edit student by id\n3.Delete student by id");
            System.out.print("\n4.Sort Students by gpa\n5.Sort student by name\n6.Show student");
            System.out.print("\n0.Exit");
            System.out.print("\nVui lòng chọn chức năng: ");
            choose = sc.nextInt();
            if(choose == 0){
                break;
            }
            else {
                switch (choose){
                    case 1:
                        int n;
                        System.out.print("nhap so sv can add: ");
                        n = sc.nextInt();
                        addStudent(sv,n);
                        break;
                    case 2:
                        int id;
                        System.out.println("nhap id: ");
                        id = sc.nextInt();
                        editById(sv,id);
                        break;
                    case 3:
                        System.out.println("nhap id: ");
                        int id1 = sc.nextInt();
                        if(checkId(sv,id1) == false){
                            System.out.print("id khong ton tai");
                            return;
                        }

                        sv.remove(id1);
                        break;
                    case 4:
                        sortByGpa(sv);
                        for(int i = 0 ; i < sv.size(); i++){
                            sv.get(i).xuat();
                        }
                        break;
                    case 5:
                        sortByName(sv);
                        sv.get(0).format();
                        for(int i = 0 ; i < sv.size(); i++){
                            sv.get(i).xuat();
                        }
                        break;
                    case 6:
                        sv.get(0).format();

                        for(int i = 0 ; i < sv.size(); i++){
                            sv.get(i).xuat();
                        }
                        break;
                }
            }
        }
    }

    public static void addStudent(ArrayList <SinhVien> sv, int n){
        for(int i = 0 ; i < n ; i++){
            SinhVien p = new SinhVien();
            p.nhap();
            sv.add(p);
        }
    }

    public static void editById(ArrayList<SinhVien> sv ,int id){
        Scanner sc = new Scanner(System.in);
        int choose1;

        if(checkId(sv ,id) == false){
            System.out.print("id khong ton tai");
            return;
        }

        System.out.print("====Cac chuc nang====\n");
        System.out.print("1.Edit all\n2.Edit name\n3.Edit age\n4.Edit address");
        System.out.print("\n5.Edit gpa\n0.Exit");
        System.out.print("\nChon chuc nang: ");

        choose1 = sc.nextInt();

        switch(choose1){
            case 0:
                break;
            case 1:
                SinhVien p = new SinhVien();
                p.nhap1();
                sv.set(id,p);
                sv.get(id).setId(id);
                break;
            case 2:
                System.out.print("nhap name: ");
                sc.nextLine();
                sv.get(id).setName(sc.nextLine());
                break;
            case 3:
                System.out.print("nhap age: ");
                sv.get(id).setAge(sc.nextInt());
                break;
            case 4:
                System.out.print("nhap address: ");
                sc.nextLine();
                sv.get(id).setAddress(sc.nextLine());
                break;
            case 5:
                System.out.print("nhap gpa: ");
                sv.get(id).setGpa(sc.nextDouble());
                break;
        }
    }

    public static boolean checkId(ArrayList<SinhVien> sv ,int id){
        boolean check = false;

        for(int i = 0 ; i < sv.size() ; i++){
            if(sv.get(i).getId() == id){
                check = true;
                break;
            }
        }

        return check;
    }

    public static void sortByName(ArrayList<SinhVien> sv ){
        sv.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }

    public static void sortByGpa(ArrayList<SinhVien> sv){
        sv.sort((o1, o2) -> (int)(o1.getGpa() - o2.getGpa()));
    }
}
