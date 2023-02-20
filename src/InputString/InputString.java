package InputString;

import java.util.ArrayList;
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        System.out.println("Введите количество игроков");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<String> pl = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите имя игрока");
            Scanner scc = new Scanner(System.in);
            String name = scc.nextLine();
            pl.add(name);
        }
        System.out.println(" Игроки "+pl);
    }
}
