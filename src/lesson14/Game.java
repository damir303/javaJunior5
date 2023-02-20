package lesson14;

import java.util.ArrayList;
public class Game implements IGame {
    private Coloda coloda = new Coloda();

    private ArrayList<Player> players = new ArrayList<>();

    @Override
    public void addNewPlayer(Player player) {
        players.add(player);
    }

    @Override
    public boolean startGame() {
        return false;
    }

    @Override
    public void dealPlayerCards() {
        for (Player player : players) {
            player.addCardToHand(coloda.getRandomCard());
            player.addCardToHand(coloda.getRandomCard());
        }
    }

    @Override
    public void dealMainRound() {
        for (Player player : players) {
            while (player.needMoreCard()) {
                player.addCardToHand(coloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {        // Проверяем у кого больше 21, тот вышел из игры.
        for (Player player : players) {
            if (player.getValues() > 21) {
                player.setWinner(false);
            }
        }
        if (countGamePlayer() == 0) {
            for (Player player : players) {
                if (player instanceof Deller) {
                    System.out.println("Победил диллер");
                    player.getValues();
                    player.openHand();
                }
            }
        } else if (countGamePlayer() == 1) {
            for (Player player : players) {
                if (player.isWinner()) {
                    System.out.println(player);
                    player.getValues();
                    player.openHand();

                }
            }
        } else if (countGamePlayer() > 1) {
            int winWalue = 0;
            for (Player p : players) {
                if (p.isWinner() && winWalue < p.getValues()) {
                    winWalue = p.getValues();
                }
            }
            for (Player player : players) {
                if (winWalue == player.getValues()) {
                    System.out.println(player + " Победитель");
                    player.getValues();
                    player.openHand();
                }

            }
        }
    }

    private int countGamePlayer() {
        int i = 0;
        for (Player player : players) {
            if (player.isWinner()) {
                i++;
            }
        }
        return i;
    }
}
