package lesson5;
//вывести все с заглавной буквы
public class Dz5UpLetter {
    public static void main(String[] args) {
        String text = "/*Так как в самом начале StringBuffer инициализируется строкой \"Java\", " +
                "то его емкость составляет 4 + 16 = 20 символов. " +
                "Затем мы увеличиваем емкость буфера с помощью вызова strBuffer */";
        text = text.toUpperCase();
        System.out.println(text);
    }
}
