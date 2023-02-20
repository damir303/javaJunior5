package lesson1;

public class DzDop {
    public static void main(String[] args) {
        int money = 5;
        int pizza = 230;
        int dirol = 26;
        double konfet = 2.5;
        int kolPizz = 0;
        int kolDirol = 0;
        int sdacha = 0;
        int kolKonfet = 0;
        kolPizz = money / pizza;
        sdacha = money - kolPizz * pizza;
        if (sdacha > 2.5)
            kolDirol = sdacha / dirol;
        sdacha = sdacha - kolDirol * dirol;
        if (sdacha > 2.5)
            kolKonfet = (int) (sdacha / konfet);
        sdacha = (int) (sdacha - kolKonfet * konfet);
        System.out.println("На эти деньги мы можем купить:");
        System.out.println("-пиццы" + " " + kolPizz);
        System.out.println("-жвачки" + " " + kolDirol);
        System.out.println("-конфет" + " " + kolKonfet);
        System.out.println("Сдача с магазина:" + " " + sdacha);
    }
}
