package lesson6;

public class StringUtil {
    public static int countWords(String text) {
        // Привет, меня зовут Саша а тебя ?
        String[] words = text.split(" ");
        return words.length;

    }

    public static void reverse(String text) {
        char[] symbolsFromText = text.toCharArray();
        for (int i = symbolsFromText.length - 1; i >= 0; i--) {
            System.out.print(symbolsFromText[i]);

        }
        System.out.println();
    }

    public static void printPoints(String text) {
        char[] countPoints = text.toCharArray();
        for (int i = 0; i < countPoints.length; i++) {
            if (countPoints[i] == '.' || countPoints[i] == '?' || countPoints[i] == '/') {
                System.out.println(countPoints[i]);
            }
        }
    }

    public static void replaceFirstWordsSymbolWithUpper (String text){
        char[] charsFromText = text.toCharArray();
        System.out.print(Character.toUpperCase(charsFromText[0]));
        for (int i = 1;i < charsFromText.length;i++){
            System.out.print(charsFromText[i]);
            if (charsFromText[i] == ' ' ){
                charsFromText [i + 1] = Character.toUpperCase(charsFromText[i + 1]);

            }
        }
    }

}
