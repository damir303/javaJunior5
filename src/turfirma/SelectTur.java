package turfirma;

public class SelectTur {
    public static void select(String[][] tur, char zvezda, String transport) {
        for (String[] strings : tur) {
            if (strings[3].indexOf(zvezda) == 0 && strings[4].indexOf(transport) == 0) {
                System.out.printf("Тур: %s, Стоимость %s, добираться %s, %s, добираться на %s\n",
                        strings[0], strings[1], strings[2], strings[3], strings[4]);
            }
        }
    }
}
