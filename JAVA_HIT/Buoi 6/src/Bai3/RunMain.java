package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<News> x = new ArrayList<>();
        int choose;
        while(true){
            System.out.println("====MENU====");
            System.out.println("1.Insert news\n2.View list news\n3.Average rate\n4.Exit ");
            choose = sc.nextInt();
            if(choose == 4){
                break;
            }
            switch (choose){
                case 1:
                    News news = new News();
                    System.out.println("nhap id: ");
                    news.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("nhap title: ");
                    news.setTitle(sc.nextLine());
                    System.out.println("nhap publishDate: ");
                    news.setPublishDate(sc.nextLine());
                    System.out.println("nhap author: ");
                    news.setAuthor(sc.nextLine());
                    System.out.println("nhap content: ");
                    news.setContent(sc.nextLine());
                    System.out.println("nhap 3 rate: ");
                    news.inputRateList();
                    x.add(news);
                    break;
                case 2:
                    for(int i = 0; i < x.size(); i++){
                        System.out.println("====HIEN THI====");
                        x.get(i).display();
                    }
                    break;
                case 3:
                    for(int i = 0; i < x.size(); i++){
                        System.out.println("====HIEN THI====");
                        x.get(i).calculate();
                        x.get(i).display();
                    }
                    break;
                default: break;
            }
        }







    }
}
