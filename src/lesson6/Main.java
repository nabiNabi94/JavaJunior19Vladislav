package lesson6;

public class Main {


    /**
     * 1- модификатор доступа
     * public (доступ внутри данного проекта)
     * __________ ( доступ внутри текущей папки )
     * protected ( доступ внутри текущего класса, и его наследника )
     * private ( доступ внутри текущего класса )
     * 2 - static (либо ставим, либо нет )
     * 3 - возвращаемый тип ( или слово void )
     * 4 - название метода с мальнекой буквы
     * 5 - входящие параметры в (), или просто () если их нет
     * 6 - тело выполнения метода
     */

    public static int minNum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }
        return c;
    }
    public static String  figura ( int a, int b,int c, int d){
        if (a == b && b == c && c == d ) {
            return "квадрат";

        }
        if (a == b && c == d && a != c) {
            return "прямоугольник";

        }
        return "четырехугольник";
    }


}

