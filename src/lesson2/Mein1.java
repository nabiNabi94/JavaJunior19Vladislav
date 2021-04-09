package lesson2;

public class Mein1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треогольник ");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if (a == c && a != b) {
            System.out.println ("Это равнобедренный треугольник");
        } else if (a == b && a != c) {
            System.out.println("Это равнобедренный треугольник");
        } else if (b == c && b != a) {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
