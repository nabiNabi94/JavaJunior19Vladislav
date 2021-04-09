package homeWork.lesson4;

public class HomeTask2Lesson4 {
    public static void main(String[] args) {
        String text = "I, am stupid programmer?";
        String [] newText = text.split(" ");
        String zamena = text.replaceAll("[auioeAUIOE]","?");


        if (text.contains(",")) {
            System.out.println(",");
        }
        if (text.contains("?")) {
            System.out.println("?");
        }

        if (text.contains(".")) {
            System.out.println(".");
        }
        if (text.contains("!")) {
            System.out.println("!");
        }
        System.out.println(zamena);

        for (int i = 0;i < newText.length; i++){
            System.out.println(newText[i]);
        }
        for (int i = newText.length -1 ;i >= 0; i--){
            System.out.println(newText[i]);
        }



    }
}
