package lesson3;

public class Main11 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i <= 100; i++ ){
            if (i % 5 == 0 && i % 7 == 0){
                sum = sum + i;

            }

        }
        System.out.println(sum);
    }
}
