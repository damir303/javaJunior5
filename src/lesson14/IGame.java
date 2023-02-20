package lesson14;

public interface IGame {
    void addNewPlayer(Player player); // добавить игрока?
    boolean startGame(); // начать игру?
    void dealPlayerCards(); // раздать по две карты.
    void dealMainRound(); // добавить карту ещё?
    void printWinner(); // Показать победителя.

}
