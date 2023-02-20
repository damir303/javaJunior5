package lesson4;

//Thread.sleep(1000);
public class TimerReversSchet {
    public static void main(String[] args) throws InterruptedException {
        int[] hour = {6, 60, 60};
        for (int h = hour[0] - 1; h >= 0; h--) {
            for (int m = hour[1] - 1; m >= 0; m--) {
                for (int s = hour[2] - 1; s >= 0; s--) {
                    Thread.sleep(1000);
                    System.out.println("Осталось  " + h + "  часа  " + m + " минут  " + s + "  секунд");
                }
            }
        }
    }
}