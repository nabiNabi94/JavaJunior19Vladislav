package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Triangle vasya = new Triangle(12,12,12);
        Triangle petya = new Triangle(10,12,14);
        Triangle fedya = new Triangle(10,10,8);

        vasya.setSideA(3);



        vasya.printTapeTriangle();
        petya.printTapeTriangle();
        fedya.printTapeTriangle();
        System.out.println(vasya.getSideA());


    }
}
