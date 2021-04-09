package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Matrix numbers = new Matrix(5,5);
        Matrix numbers1 = new Matrix(5,5);

        numbers.fillMatrix(2);
        numbers1.fillMatrix(3);
        int huy = 0;
        for (int i = 0; i < numbers.getRows();i++){
            for (int j = 0; j < numbers.getColumns();j++){
                numbers.setValueAt(i,j,huy++);
            }

        }


//        numbers.mul(numbers1).printToConsole();
//        numbers.mul(7).printToConsole();
        numbers.printToConsole();
//        numbers.transpose().printToConsole();

        System.out.println(numbers.isNullMatrix());
        System.out.println(numbers.isIdentityMatrix());







    }

}
