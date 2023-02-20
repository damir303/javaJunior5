package lesson14;

import lesson14.Card;
import lesson14.Player;

public class Deller extends Player {
    //private String name;
    public Deller() {
    }

    public Deller(String name) {
        super (name);
    }

    @Override
    public boolean needMoreCard() {
        int c = 0;
        for (Card card : cards) {
            c += card.getValue();
        }
        values = c;
        if (c >= 17) {
            return false;
        }
        return true;
    }
}
