package lesson10;

public class HomeWorkMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,6,7);
        Square square = new Square(4,4,4,4);
        Rectangles rectangles = new Rectangles(4,4,5,5);
        Shape shape = new Shape(10);
        Oval oval = new Oval(5,7);


//        System.out.println(triangle.getPerimeter());
//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getA());
//        triangle.printInfoTriangle();
//        square.printInfoSquare();
//        rectangles.printInfoRectangles();
//        shape.printInfoShape();
//        System.out.println(shape.getRadius());
//        oval.printInfoOval();

        Figure[] figures = new Figure[5];
        figures[0] = triangle;
        figures[1] = shape;
        figures[2] = rectangles;
        figures[3] = square;
        figures[4] = oval;

        for (Figure figure : figures) {
           figure.printInfoFigure();
            
        }
        







    }
}
