package lesson4;

public class Main11 {
    public static void main(String[] args) {
        String email = "nabivlad@mail.ru";
        String[] partsOfEmail = email.split("@");

        if (partsOfEmail.length == 1) {
            System.out.println("нет собачки!");
            return;

        }
        if (partsOfEmail.length > 2) {
            System.out.println("больше одной собачки!");
            return;
        }
        if (partsOfEmail[0].startsWith(".") || partsOfEmail[0].endsWith(".")) {
            System.out.println("Присутстует точка в начале или в конце!");


        }
        if (partsOfEmail[1].startsWith(".") || partsOfEmail[1].endsWith(".")) {
            System.out.println("Присутстует точка в домене начале или в конце!");


        }
        if (partsOfEmail[1].indexOf(".") == -1){
            System.out.println("нет точки после собачки");
        }

    }
}
