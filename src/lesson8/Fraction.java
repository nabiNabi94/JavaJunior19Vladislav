package lesson8;

public class Fraction {
    private int numerator;/**числитель*/
    private int denominator;/**знаменатель*/
    private int integer;

    public Fraction(){/**Констрктор по умолчанию*/

    }

    public Fraction(int numerator, int denominator,int integer){/**Конструктор*/
        this.denominator = denominator;
        this.numerator = numerator;
        this.integer =  integer;
    }

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;

    }

    public void setNumerator (int A){/** изменяет значение числителя*/
        this.numerator = numerator;
    }

    public void setDenominator (int b){
        this.denominator = denominator;
    }
    public void setInteger (int integer){
        this.integer = integer;
        
    }

    public int getNumerator(){/** возвращает значание числителя*/
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }
    public int getInteger(){
        return integer;
    }

    public void printFraction(){
        System.out.println(integer + " " + numerator +"/"+ denominator);
    }

}
