package lesson4;

public class Main6 {
    public static void main(String[] args) {
        String email = "qwertasdf@mail.ru";
        String[] emaiPoSobachke = email.split("@");
        System.out.println(emaiPoSobachke);

        if (emaiPoSobachke.length != 2) {
            System.out.println("email не подходит . Неверное колличество собачек");
            return;


        }
        if (!emaiPoSobachke[1].contains(".")) {
            System.out.println("email не подходит . Нет точки");
            return;

        }
        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("email не подходит . Начинается или заканчивается на точку");
            return;

        }

    }
}
