package lesson5;
//посчитать количество английских букв
public class Dz2UppercaseEnglish {
    public static void main(String[] args) {
        String text = "/*Так как в самом начале StringBuffer инициализируется строкой \"Java\", "
                + "то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера "
                + "с помощью вызова strBuffer */";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.codePointAt(i) >= 65 && text.codePointAt(i) <= 90)||(text.codePointAt(i) >= 97 && text.codePointAt(i) <= 122)) {
                    count++;
                }
        }
        System.out.println("Текст содержит "+count + " английских букв");
    }
}
