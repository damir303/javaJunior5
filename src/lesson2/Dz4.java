package lesson2;
//Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
public class Dz4 {
    public static void main(String[] args) {
        for (int i = 20; i < 60; i++) {
            if (i < 30 != i > 40) {
                System.out.println(i);
            }
        }
    }
}
