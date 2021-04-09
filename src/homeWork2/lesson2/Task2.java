package homeWork2.lesson2;

public class Task2 {
    public static void main(String[] args) {
        int storonaA = 5;
        int storonaB = 5;
        int storonaC = 5;
        int storonaD = 6;

        if (storonaA == storonaB && storonaB == storonaC && storonaC == storonaD) {
            System.out.println("Это квадрат");
        } else if (storonaA == storonaB && storonaC == storonaD || storonaA == storonaC && storonaB == storonaD || storonaA == storonaD && storonaB == storonaC) {
            System.out.println("Это прямоугольник");

        } else {
            System.out.println("Это разносторонний четырехуголник ");
        }
    }
}
