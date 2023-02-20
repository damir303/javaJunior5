package lesson6;

import java.util.Scanner;

//                              (?=.*[0-9])            цифра должна появиться хотя бы один раз
//                              (?=.*[a-z])            строчная буква должна встречаться по крайней мере один раз
//                              (?=.*[A-Z])            заглавная буква должна встречаться по крайней мере один раз
//                              (?=.*[@#$%^&+=])       специальный символ должен появиться хотя бы один раз
//                              (?=\S+$)               во всей строке не допускается пробел
//                              .{8,}                  по крайней мере 8 персонажи
public class Dz4Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пароль согласно\n" +
                " 2.1) пароль не должен соответствовать почте\n" +
                " 2.2) минимум 8 символов\n" +
                " 2.3) одна заглавная\n" +
                " 2.4) один символ\n" +
                " 2.5) на английском\n");
        String pass = input.nextLine();
        String chekpass = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        boolean rezult = pass.matches(chekpass);
        boolean rezult1 = pass.contains("mail.");
        if (rezult || rezult1) {
            System.out.println(pass + "   Пароль  " + rezult);
        }
        else {
            System.out.println(" Fault ");
        }
        }

    }


//Asdfghju%3