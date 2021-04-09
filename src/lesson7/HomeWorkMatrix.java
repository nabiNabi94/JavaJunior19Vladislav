package lesson7;

public class HomeWorkMatrix {
    public static void main(String[] args) {
        int[][] numbers = new int[6][6];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i + j == numbers.length - 1) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
        int[][] ches = {{20, 30, 40, 44, 10},
                        {12, 14, 16, 18, 20},
                        {22, 24, 26, 28, 30},
                        {32, 34, 36, 38, 40}};
        for (int i = 0; i < ches.length; i++) {
            for (int j = 0; j < ches[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0){
                    System.out.print(ches[i][j]);

                }else if (i % 2 != 0 && j % 2 != 0 ){
                    System.out.print(ches[i][j]);

                }
                else {
                    System.out.print(" " + " ");
                }


            }
            System.out.println();

        }
    }
}
