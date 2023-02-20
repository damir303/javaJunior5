package lesson5;

public class Trening {
    public static void main(String[] args) {
        int a = 5;
        int count = 0;
        do {
            a = a + 6;
            count++;
        } while (a < 1000);
        System.out.println(count);
    }
}


