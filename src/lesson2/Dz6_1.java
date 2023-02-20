package lesson2;

//Даны два числа (a,b)  a > b нужно посчитать, сколько раз
// нужно умножить на 2 число b чтобы тот был больше а:
public class Dz6_1 {
    public static void main(String[] args) {
        int a = 44;
        int b = 5;
        int q = 0;
        for (int i = b; b < a; i *= 2, b = i) {
            q++;
        }
        System.out.println(q);
    }
}

