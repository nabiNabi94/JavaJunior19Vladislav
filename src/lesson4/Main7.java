package lesson4;

public class Main7 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int value = 0;
        int sumChet = 0;
        int sumNeChet = 0;

        for (int i = 0;i <= 9  ;i++) {
            mass[i] = value;
            value = value + 3;
            if (value % 2 == 0){
                sumChet = value;
            }
            if (value % 2 != 0 ){
                 sumNeChet = value;
            }


        }
        System.out.println(sumChet-sumNeChet);


    }
}
