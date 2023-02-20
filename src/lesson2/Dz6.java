package lesson2;
// Даны два числа (a,b).  a больше b. нужно посчитать,
// сколько раз нужно умножить на 2 число b чтобы тот был больше а:
public class Dz6 {
    public static void main(String[] args) {
        int a = 18;   // первое число а
        int b = 3;   // второе числа в
        int c ;
        for (int i = 1; b < a; i++) {
            c = b * i;
            if (c > a) {
                b = b + c;
                System.out.println(i);
            }
        }
    }
}