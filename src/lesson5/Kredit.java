package lesson5;

public class Kredit {
    public static void main(String[] args) {
        double summ = 1000000;
        int plat = 15000;
        int mes =0;
        while (summ>0){
            mes++;
            summ= summ-plat;
        }
        System.out.println(mes);
    }
}
