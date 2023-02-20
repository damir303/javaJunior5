package lesson14;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;
    protected int values;
    protected boolean winner = true;
    protected ArrayList<Card> cards = new ArrayList<>();

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int getValues() {
        return values;
    }

    @Override
    public void addCardToHand(Card card) {   // Получить ещё карту?
        cards.add(card);
    }

    @Override
    public boolean needMoreCard() {
        System.out.println(" Играем с " + name);
        int count = 0;
        for (Card card : cards) {
            card.open();
            if (card.getValue() == 1) {
                if (count + 11 > 21) {
                    count += card.getValue();
                } else {
                    count += 11;
                }
            } else {
                count += card.getValue();
            }
        }
        System.out.println("Баллов у  " + name + " " + count);
        System.out.println("Нужны карты ? Да - 1, Нет - 2. " );
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        values = count;
        if (i == 1) {
            return true;
        }
        return false;
    }

    public void openHand() {
        for (Card card : cards) {
            card.open();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
