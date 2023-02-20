package lesson3;

public class DZ1 {
    public static void main(String[] args) {
        int[] mass1 = {111,456,234,75};
        int[] mass2 = {4, 5, 6, 7,888,6433,22356};
        int[] mass3 = new int[mass1.length + mass2.length];
        for (int i = 0; i < mass3.length; i++) {
            if (mass1.length > i) {
                mass3[i] = mass1[i];
            } else
                mass3[i] = mass2[i - mass1.length];
            System.out.print(mass3[i] + "  ");
        }
    }
}
