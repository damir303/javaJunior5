package lesson3;
// таймер обратного отсчета с 6 часов
public class Dz2Timer6hour {
    public static void main(String[] args) throws InterruptedException {
        int[] hour = {6, 60, 60};
        hour[0] -= 1;
        hour[1] -= 1;
        int timer = 6 * 60 * 60;                 //  (6ч)*(60мин)*(60сек) = 21600 сек
        for (int s = timer; s > 0; s--) {        // секунды
            hour[2] -= 1;
            Thread.sleep(1000);   // задержка на 1 сек
            if (hour[2] < 0) {
                for (int m = 1; m > 0; m--) {      // минуты
                    hour[1] -= 1;
                    hour[2] = 59;
                }
                if (hour[1] < 0) {                // часы
                    for (int h = 1; h > 0; h--) {
                        hour[0] -= 1;
                        hour[1] = 59;
                    }
                }
            }
            System.out.println("Осталось  " + hour[0] + "  часа  " + hour[1] + " минут  " + hour[2] + "  секунд");
        }
    }
}