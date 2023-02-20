package lesson5;
//все цифры заменить на звездочку (*)
public class Dz3ZnakCifra {
    public static void main(String[] args) {
        String text = "/*Так как в самом начале StringBuffer инициализируется строкой \"Java\", " +
                "то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера " +
                "с помощью вызова strBuffer */";
        System.out.println(text);
        String ntext = new String();
        for (int i = 0; i < text.length(); i++) {
            if (48 <= text.codePointAt(i) && 57 >= text.codePointAt(i)) {
                 ntext = text.replaceAll("[0-9]", "*");
            }
        }
        System.out.println(ntext);
        System.out.println("все цифры заменились на звездочку (*) ");

    }
}
