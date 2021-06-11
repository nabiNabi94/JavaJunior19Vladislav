package lesson17;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImple implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null && number2 == null) {
            throw new NullPointerException("Пустые намберы");
        }
        double num1 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(" number1 не число");
        }

        double num2 = 0;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(" number2 не число");
        }

        if (num2 == 0) {
            throw new ArithmeticException("number 2 = 0");
        }
        return (num1 / num2);
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Ошибка");
        }
        String[] words = text.split(" ");
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            if (words[i] == word){
                indexes.add(i);
            }
        }
        int[] index = new int[indexes.size()];
        for(int i = 0; i < index.length; i++) {
            index[i] = indexes.get(i);
        }
        return index;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        Pattern p = Pattern.compile("[+-]?(\\d+([.]\\d*)?(e[+-]?\\d+)?|[.]\\d+(e[+-]?\\d+)?)");
        Matcher m = p.matcher(text);
        if(!m.find()){
            throw new CustomException("Чисел не найдено");
        }
        m.reset();

        while(m.find()) {
            double d = Double.parseDouble(m.group(0));
            System.out.println(d);
        }
        return new double[0];
    }


}


