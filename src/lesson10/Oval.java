package lesson10;

import java.util.Objects;

public class Oval extends Figure{
    private int radius1;
    private int radius2;
    private int diameter;

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * Math.sqrt(((radius1 * radius1) + (radius2 * radius2)) / 2));
    }

    @Override
    public void setPerimeter(int perimeter) {
        this.setPerimeter(perimeter);
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * (radius1 * radius2));
    }

    @Override
    public void setArea(int area) {
        this.setArea(area);
    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oval)) return false;
        if (!super.equals(o)) return false;
        Oval oval = (Oval) o;
        return getRadius1() == oval.getRadius1() && getRadius2() == oval.getRadius2() && getDiameter() == oval.getDiameter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRadius1(), getRadius2(), getDiameter());
    }

    @Override
    public String toString() {
        return "Oval{" +
                "radius1=" + radius1 +
                ", radius2=" + radius2 +
                ", diameter=" + diameter +
                '}';
    }
    public Oval (){

    }

    public Oval(int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;

    }

    @Override
    public void printInfoFigure() {
        System.out.println("Я овал моя длинна окружности : " +  getPerimeter() + " , моя площадь: " + getArea ());

    }


}
