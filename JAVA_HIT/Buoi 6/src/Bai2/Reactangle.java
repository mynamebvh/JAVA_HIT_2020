package Bai2;

public class Reactangle implements IShape{
    private double length;
    private double height;

    public Reactangle() {
    }

    public Reactangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.length * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.length) * 2;
    }


}
