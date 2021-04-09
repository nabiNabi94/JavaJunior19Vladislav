package lesson8;

public class HomeWorkCalculatorFraction {
    public static Fraction sumFraction(Fraction fraction, Fraction fraction1,Fraction integer) {

        if (fraction.getInteger() > 0){
          fraction.setNumerator(fraction.getInteger() * fraction.getNumerator() + fraction.getDenominator());
        }
        if (fraction1.getInteger() > 0){
            fraction1.setNumerator(fraction1.getInteger() * fraction1.getNumerator() + fraction1.getDenominator());
        }

        int commonDenominator = fraction.getDenominator() * fraction1.getDenominator();
        int commonNumerator = fraction.getNumerator() * fraction1.getDenominator()
                + fraction.getDenominator() * fraction1.getNumerator();


        Fraction result = new Fraction(commonNumerator, commonDenominator);

        int wholePart = commonNumerator / commonDenominator ;
        int wholeUsedPart = wholePart * commonNumerator;

        if (commonDenominator == commonNumerator){
            result = new Fraction();

        }

        for (int i = 9; i >= 2; i--) {
            if (commonDenominator % i == 0 && commonNumerator % i == 0){
                result = new Fraction(commonNumerator / i,commonDenominator / i);
                i = 2;
            }
        }


        return result;
    }

    public static Fraction subtraction(Fraction fraction, Fraction fraction1) {
        int commonDenominator = fraction.getDenominator() * fraction1.getDenominator();
        int commonNumerator = fraction.getNumerator() * fraction1.getDenominator()
                - fraction.getDenominator() * fraction1.getNumerator();



        Fraction result = new Fraction(commonNumerator,


                commonDenominator);

        if (commonDenominator > commonNumerator){

        }

        for (int i = 9; i >= 2; i--) {
            if (commonDenominator % i == 0 && commonNumerator % i == 0){
                result = new Fraction(commonNumerator / i,commonDenominator / i);
                i = 2;

            }

        }

        return result;


    }
    public static Fraction multiFraction(Fraction fraction, Fraction fraction1){
        int commonDenominator = fraction.getDenominator() * fraction1.getDenominator();
        int commonNumerator = fraction.getNumerator() * fraction1.getNumerator();

        Fraction result = new Fraction(commonNumerator, commonDenominator);

        for (int i = 9; i >= 2; i--) {
            if (commonDenominator % i == 0 && commonNumerator % i == 0){
                result = new Fraction(commonNumerator / i,commonDenominator / i);
                i = 2;

            }

        }
        return result;



    }
    public static Fraction divisionFraction(Fraction fraction, Fraction fraction1){
        int commonDenominator = fraction.getDenominator() * fraction1.getNumerator();
        int commonNumerator = fraction.getNumerator() * fraction1.getDenominator();

        Fraction result = new Fraction(commonNumerator, commonDenominator);

        for (int i = 9; i >= 2; i--) {
            if (commonDenominator % i == 0 && commonNumerator % i == 0){
                result = new Fraction(commonNumerator / i,commonDenominator / i);
                i = 2;

            }

        }
        return result;


    }



}
