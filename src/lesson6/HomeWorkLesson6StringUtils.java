package lesson6;

public class HomeWorkLesson6StringUtils {

    public static void splittingByLine(String text) {
        String[] newText = text.split(" ");
        for (int i = 0; i < newText.length; i++) {
            System.out.println(newText[i]);

        }
    }

    public static void sumSymbolsOfText(String text) {
        char[] symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] alphabet = text.toCharArray();
        int words = 0;

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {

                if (symbols[i] == alphabet[j]) {
                    words = words + 1;
                } else {

                }
            }

        }
        System.out.println(words);


    }

    public static void compareWordCount(String text1, String text2) {
        String[] sumWords = text1.split(" ");
        String[] sumWords2 = text2.split(" ");
        if (sumWords.length > sumWords2.length) {
            System.out.println(text1);

        } else {
            System.out.println(text2);
        }


    }

    public static void evenVsOdd(int numbers1, int numbers2, int numbers3, int numbers4, int numbers5) {
        int[] massNum = {numbers1, numbers2, numbers3, numbers4, numbers5};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < massNum.length; i++) {

            if (i % 2 == 0) {
                even = even + 1;

            } else {
                odd = odd + 1;
            }
        }
        if (even > odd) {
            System.out.println("Больше четных" + even);
        } else {

            System.out.println("Больше нечетных" + odd);

        }


    }

    public static void capitalLetter(String text) {
        String words[] = text.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
            System.out.println(capitalizeWord);
        }


    }
}

