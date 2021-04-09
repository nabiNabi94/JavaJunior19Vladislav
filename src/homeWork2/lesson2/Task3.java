package homeWork2.lesson2;

public class Task3 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 1;
        int number3 = 3;
        int number4 = 2;
        int number5 = 1;

        if (number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5) {
            System.out.println("Самое маленькое число: " + number1);
        }else if (number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5){
            System.out.println("Самое маленькое число: " + number2);
        }else if (number3 <= number2 && number3 <= number1 && number3 <= number4 && number1 <= number5){
            System.out.println("Самое маленькое число: " + number3);
        }else if (number4 <= number2 && number4 <= number3 && number4 <= number1 && number4 <= number5){
            System.out.println("Самое маленькое число: " + number4);
        }else if (number5 <= number2 && number5 <= number3 && number5 <= number4 && number5 <= number1){
            System.out.println("Самое маленькое число: " + number5);
        }


    }
}
