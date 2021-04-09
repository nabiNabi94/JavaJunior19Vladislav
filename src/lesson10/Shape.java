package lesson10;

import java.util.Objects;

public class Shape extends Figure{
    private int radius;
    private int diameter;

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public void setPerimeter(int perimeter) {
        this.setPerimeter(perimeter);
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * (radius * radius));
    }

    @Override
    public void setArea(int area) {
        this.setArea(area);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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
        if (!(o instanceof Shape)) return false;
        if (!super.equals(o)) return false;
        Shape shape = (Shape) o;
        return getRadius() == shape.getRadius() && getDiameter() == shape.getDiameter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRadius(), getDiameter());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }

    public Shape (){

    }

    public Shape(int radius) {
        this.radius = radius;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("Я круг моя длинна окружности : " +  getPerimeter() + " , моя площадь: " + getArea ());

    }



}
