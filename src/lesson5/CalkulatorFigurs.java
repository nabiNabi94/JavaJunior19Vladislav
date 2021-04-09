package lesson5;

import java.util.Scanner;

public class CalkulatorFigurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фигуру");
        String figura = scanner.nextLine();

        System.out.println("Что посчитать?");
        String action = scanner.nextLine();

        if (figura.equalsIgnoreCase("круг")) {
            System.out.println("Ведите радиус");
            double radius = scanner.nextDouble();
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("Периметр круга: " + (2 * Math.PI * radius));
            }
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Периметр круга: " + (Math.PI * (radius * radius)));


            } else
                System.out.println("Это не действие");

        } else if (figura.equalsIgnoreCase("Овал")) {
            System.out.println("введите радиус А:");
            double radius1 = scanner.nextDouble();
            System.out.println("введите радиус В:");
            double radius2 = scanner.nextDouble();

            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("Периметр овала: " + (
                        2 * Math.PI * Math.sqrt(((radius1 * radius1) + (radius2 * radius2)) / 2)));
            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь овала: " + (Math.PI * (radius1 * radius2)));
            } else {
                System.out.println("Некоректные данные");
            }

        } else if (figura.equalsIgnoreCase("трапеция")) {
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("введите сторону");
                double storona1 = scanner.nextDouble();
                System.out.println("введите сторону");
                double storona2 = scanner.nextDouble();
                System.out.println("введите сторону");
                double storona3 = scanner.nextDouble();
                System.out.println("введите сторону");
                double storona4 = scanner.nextDouble();

                System.out.println("периметр" + (storona1 + storona2 + storona3 + storona4));
            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("введите основание1");
                double osnova1 = scanner.nextDouble();
                System.out.println("введите основание2");
                double osnova2 = scanner.nextDouble();
                System.out.println("введите высоту");
                double vusota3 = scanner.nextDouble();

                System.out.println("площадь" + ((osnova1 + osnova2) / 2) * vusota3);
            }
        } else if (figura.equalsIgnoreCase("Прямоугольник")) {
            System.out.println("введите сторону");
            double storona1 = scanner.nextDouble();
            System.out.println("введите сторону");
            double storona2 = scanner.nextDouble();
            System.out.println("введите сторону");
            double storona3 = scanner.nextDouble();
            System.out.println("введите сторону");
            double storona4 = scanner.nextDouble();


            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("периметр" + (storona1 + storona2 + storona3 + storona4));
            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь" + (storona1 * storona2));
            }

        } else
            System.out.println("Такой фигуры у нас нет");


    }
}
