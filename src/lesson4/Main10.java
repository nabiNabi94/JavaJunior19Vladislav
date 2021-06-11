package lesson4;

public class Main10 {
    public static void main(String[] args) {
        String text = "Java top program";
      char[] massSymbols =  text.toCharArray();
      for (int i = massSymbols.length -1;i >= 0;i--){
          System.out.println(massSymbols[i]);
      }
    }
}
