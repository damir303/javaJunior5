package lesson6;

public class Dz1Mail {
    public static void main(String[] args) {
        String mail = "Avenye@mail.ru";
        int fault = 0;
        for (int c = 0; c < mail.length(); c++) {
            if (mail.charAt(c)=='@') {
                fault++;
            } else if (fault == 1 && c == mail.length() - 1) {
                System.out.println(" Ok");
            }else if (fault > 1 && c == mail.length() - 1){
                System.out.println("Проверить коректнoсть ввода");
            }
        }
    }
}















