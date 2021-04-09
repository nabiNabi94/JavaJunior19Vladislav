package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String text = "i am programmer";

       int lengthOfText = text.length();
        System.out.println(lengthOfText);
       String NewText = text.replace('a','A' );
        System.out.println(text);
        System.out.println(NewText);
    }
}
