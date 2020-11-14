package Bai2;

public class RunMain {
    public static void main(String[] args) {

        IShape[] iShape = new IShape[3];

        iShape[0] = new Reactangle(3.4, 5.3);
        iShape[1] = new Circle(5.5);
        iShape[2] = new Reactangle(7.4, 4.3);

        for (int i = 0 ; i < 3; i++){
            System.out.println("dien tich " + i +  iShape[i].getArea());
            System.out.println("chu vi " + i +  iShape[i].getPerimeter());
        }
    }
}
