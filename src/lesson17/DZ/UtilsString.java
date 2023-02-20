package lesson17.DZ;

import java.util.ArrayList;
import java.util.List;

public class UtilsString implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == 0 || number2 == 0");
        }
        double n1 = 0;
        double n2 = 0;
        try {
            n1 = Double.parseDouble(number1);
        } catch (Exception e) {
            throw new NumberFormatException("number 1 не число");
        }
        try {
            n2 = Double.parseDouble(number2);
        } catch (Exception e) {
            throw new NumberFormatException("number 2 не число");
        }
        if (n2 == 0) {
            throw new ArithmeticException("деление на 0 ");
        }
        return n1 / n2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        if (text.length() == 0 || word.length() == 0) {
            throw new NullPointerException("Нет текста или искомого слова");
        }
        List<Integer> ls = new ArrayList<>();
        String[] list = text.replaceAll("\\p{Punct}", " ").split(" ");
        for (int i = 0; i < list.length; i++) {
            if (list[i].equalsIgnoreCase(word)) {
                ls.add(i);
            }
        }
        int [] rez = new int[ls.size()];
        for (int j = 0; j < ls.size(); j++) {
            rez[j]+=ls.get(j);
        }
        return rez;
    }


    @Override
    public double[] findNumbers(String text) throws CustomException {
        if (text == null) {
            throw new CustomException("Текст пустой");
        }

        return new double[0];
    }
}
