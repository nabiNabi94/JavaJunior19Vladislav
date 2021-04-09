package lesson10;

import java.util.Objects;

public class Rectangles extends Figure{
    private int a;
    private int b;
    private int c;
    private int d;

    @Override
    public int getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public void setPerimeter(int perimeter) {
        this.setPerimeter(perimeter);
    }

    @Override
    public int getArea() {
        return a * b;
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

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangles)) return false;
        if (!super.equals(o)) return false;
        Rectangles that = (Rectangles) o;
        return getA() == that.getA() && getB() == that.getB() && getC() == that.getC() && getD() == that.getD();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getA(), getB(), getC(), getD());
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
    public Rectangles (){

    }

    public Rectangles(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public void printInfoFigure() {
        System.out.println( "Я прямоугольник   мой периметер: " +  getPerimeter() + " , моя площадь: " + getArea () + " ,мои стороны: "
                +  a  + " " + b + " " + c + " " + d);
    }


}
