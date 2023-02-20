package lesson2;
//Кол-во четных чисел в диапазоне от 30 до 61
public class Dz3 {
    public static void main(String[] args) {
        int chet = 0;
        for (int i = 30; i < 61; i++) {
            if (i % 2 == 0) {
                chet++;
            }
        }
        System.out.println(chet);
    }
}
