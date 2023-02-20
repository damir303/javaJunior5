package lesson5;
//после каждой точки или запятой перходить на новую строчку
public class Dz4NewLine {
    public static void main(String[] args) {
        String text = "/*Так как в самом начале StringBuffer инициализируется строкой \"Java\", " +
                "то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера " +
                "с помощью вызова strBuffer */";
        String ntext = text.replaceAll("[.,]", "\n");

        System.out.println(ntext);
    }
}
