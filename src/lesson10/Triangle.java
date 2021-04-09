package lesson10;

import java.awt.geom.Area;
import java.util.Objects;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return getA() == triangle.getA() && getB() == triangle.getB() && getC() == triangle.getC();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getA(), getB(), getC());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle() {


    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void setPerimeter(int perimeter) {
        super.setPerimeter(perimeter);
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getArea() {
        double pp = (a + b + c) / 2.0;
        return (int) Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Override
    public void setArea(int area) {
        this.setArea(area);

    }

    public void printTapeTriangle() {
        if (a == b && a == c) {
            System.out.println("Я равносторонний треугольник");
        } else if (a != b && a != c) {
            System.out.println("Я разносторонний трекгольник");
        } else {
            System.out.println("Я равнобедренный треугольник");
        }

    }

    @Override
    public void printInfoFigure() {
        printTapeTriangle();
        System.out.println( "мой периметер: " +  getPerimeter() + " , моя площадь: " + getArea () + " ,мои стороны: "
                +  a  + " " + b + " " + c);
    }



}


