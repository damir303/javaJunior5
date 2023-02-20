package lesson5;
//(***) вывести каждое второе слово
public class Dz6EveryOtherWord {
    public static void main(String[] args) {
        String text = "/*Так как в самом начале StringBuffer инициализируется строкой \"Java\", " +
                "то его емкость составляет 4 + 16 = 20 символов. " +
                "Затем мы увеличиваем емкость буфера с помощью вызова strBuffer */";
        String[] wopds = text.split(" ");
        for (int i =0; i< wopds.length; i+=2) {
            System.out.println(wopds[i]);
        }
    }
}