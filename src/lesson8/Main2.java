package lesson8;

public class Main2 {
    public static void main(String[] args) {
        Fraction numFr = new Fraction(4,9,2);
        Fraction numFr1 = new Fraction(3,6,3);

        numFr.printFraction();
        numFr1.printFraction();

        Fraction resultAdd = HomeWorkCalculatorFraction.divisionFraction(numFr,numFr1);

        resultAdd.printFraction();

    }
}
