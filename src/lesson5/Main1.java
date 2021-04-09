package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите сторону А: ");
        int inputA = scanner.nextInt();

        System.out.println("Ведите сторону В: ");
        int inputB = scanner.nextInt();

        int ploshad = inputA * inputB;
        int perimetr = inputA + inputB + inputB + inputA;

        System.out.println ("Периметр прямоугольникаж " + perimetr);
        System.out.println("Площадь прямоугольника " + ploshad);
    }
}
