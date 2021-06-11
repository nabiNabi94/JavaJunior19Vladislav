package lesson4;

public class Main12 {
    public static void main(String[] args) {
        String word = "Hello World";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String codingWord = "";

        for (int i = 0;i < word.length();i++){
            int carentCahrWord = word.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(carentCahrWord);

            if (indexFromAlphabet != -1){
                char replaceChar = alphabet.charAt(indexFromAlphabet +1);
                codingWord = codingWord + replaceChar;
            }
            else {
                codingWord = codingWord + carentCahrWord;

            }
            System.out.println(codingWord);


        }
    }
}
