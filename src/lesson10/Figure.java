package lesson10;

import java.util.Objects;

public class Figure {
    private int perimeter;
    private int area;

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        return getPerimeter() == figure.getPerimeter() && getArea() == figure.getArea();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPerimeter(), getArea());
    }

    @Override
    public String toString() {
        return "Figure{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
    public Figure (){

    }
    public void printInfoFigure (){
        System.out.println("Мой периметр: " + perimeter + ","+ "моя площадь: " + area  );
    }





}
