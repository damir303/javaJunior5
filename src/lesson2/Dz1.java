package lesson2;
//Только четные от -100 до -50
public class Dz1 {
    public static void main(String[] args) {
        for (int i = -100; i <= -50; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}