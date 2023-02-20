package lesson14;

import java.util.Scanner;

public class BlackJac {
    public static void main(String[] args) {
        do {
            System.out.println("Введите имя дилера ");
            Scanner sc = new Scanner(System.in);
            Deller deller = new Deller(sc.nextLine());
            System.out.println("Введите имя первого игрока ");
            Player player = new Player(sc.nextLine());
            System.out.println("Введите имя второго игрока ");
            Player player2 = new Player(sc.nextLine());

            Game blackJac = new Game();   //заполнили массив картами 52, создали массив игроков
            blackJac.addNewPlayer(deller);
            blackJac.addNewPlayer(player);
            blackJac.addNewPlayer(player2);
            blackJac.dealPlayerCards();  // раздали каждому участнику по две карты.
            blackJac.dealMainRound();
            blackJac.printWinner();

        } while (true);
    }
}
