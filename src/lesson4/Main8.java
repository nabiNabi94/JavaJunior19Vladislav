package lesson4;

public class Main8 {
    public static void main (String[] args) {
        String text = new String("My names. Vlad, i am programmer!");
        String newText1 = text.replaceAll("[aeiou]", "?");
        String[] newText = text.split(" ");
        for (int i = newText.length -1; i >= 0 ; i--) {
//         String newText1 =  text.replaceAll("[aeiou]", "?");
            System.out.println(newText[i]);

        }
    }
}
