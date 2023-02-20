package lesson2;
// Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500;
public class Dz5 {
    public static void main(String[] args) {
        int summa = 20000;  //требуемая сумма
        int vznos = 9500;    // ежемесячный взнос
        int mes = 0;         // количество месяцев
        int god = 0;         // количество лет
        for (int i = 0; i < summa; i = i + vznos) {
            mes++;
            if (mes == 12) {
                god++;
                mes -= 12;
            }
        }
        System.out.println("Потребуется лет "+god +"  и "+ mes+"  месяцев");
    }
}


