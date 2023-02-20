package lesson17.DZ;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UtilsString us = new UtilsString();
        double div = us.div("33","66"); // Деление двух чисел
        System.out.println(div);
        String st = "Проверка:домашнего, 22 задание. Задание - на _ 22.1 возврат массива 3, задание, что 212 - то сложное.";
        String wd = "задание";
        int[] i = us.findWord(st,wd); // Поиск слова в тексте
        System.out.println(Arrays.toString(i));
    }
}
