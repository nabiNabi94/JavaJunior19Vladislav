package lesson7;

public class Main {
    public static void main(String[] args) {
        int [][] numbers = { {2,3,4,5,6},
                              {2,5,7,8,9},
                               {4,3,6,7,5}};
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length;j++){
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();

        }
    }
}
