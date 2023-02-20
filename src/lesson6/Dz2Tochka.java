package lesson6;

public class Dz2Tochka {
    public static void main(String[] args) {
        String text = "Проверить количество точек";
        int fault = 0;
        for (int c = 0; c < text.length(); ++c) {
            if (text.charAt(c)=='.') {
                fault++;
            } if (fault == 1 && c == text.length()-1) {
                System.out.println(" Одна точка");
            } if (fault > 1 && c == text.length()-1){
                System.out.println("Две точки");
            }
        }
    }
}
