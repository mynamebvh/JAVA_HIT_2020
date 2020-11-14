package Bai3;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {
    }

    private int[] rateList = new int [4];
    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    public void inputRateList(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3; i++){
            System.out.print("nhap rate " + i + "= ");
            this.rateList[i] = sc.nextInt();
        }
    }
    public void calculate(){
        this.averageRate = (float) ((rateList[0] + rateList[1] + rateList[2]) * 1.0 / 3);
    }

    @Override
    public void display() {
        System.out.println("title: " + this.title);
        System.out.println("publishDate: " + this.publishDate);
        System.out.println("author: " + this.author);
        System.out.println("content: " + this.content);
        System.out.println("averageRate: " + this.averageRate);
    }
}
