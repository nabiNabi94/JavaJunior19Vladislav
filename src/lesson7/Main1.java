package lesson7;

public class Main1 {
    public static void main(String[] args) {
        int [][] numbers = new int[6][6];
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length;j++){
                if (i == j){
                    System.out.print(numbers[i][j] + " ");
                }
                else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }
    }
}
