package lesson8;


public class Figura {
    public static int perimetr(int x, int y, int z) {
        return x + y + z;
    }

    public static void ploshad(int x, int y, int z) {
        int p = x + y + z;
        String per = "Периметр треугольника = ";
        Figura.print(per + p);
        float s = perimetr(x, y, z) / 2;
        double ss = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        String pl = "Площадь треугольника = ";
        Figura.print(pl + ss);
    }

    public static void tipTreugolnika(int x, int y, int z) {
        String rez = "Тип треугольника";
        if (x == y && y == z) {
            rez += " равносторонний";
        }
        if (x != y && y != z && x != z) {
            rez += " разносторонний";
        }
        if (x + y < z) {
            rez += " невозможный";
        }
        if ((x == y && x != z) || (y == z && y != x) || (z == x && z != y)) {
            rez += " равнобедренный";
        }
        Figura.print(rez);
    }

    public static double ploshadKruga(double rad) {
        double ss = 0.0;
        ss = 3.1415926535* (rad * rad);
        String skrug = "Площадь круга = ";
        Figura.print(skrug + ss);
        return ss;
    }
    public static int ploshadParallelepiped (int x, int y, int z) {
        int sparral = 2*((x*y)+(y*z)+(x*z));
        String parralelepiped = "Площадь параллелепипеда =";
        Figura.print(parralelepiped+sparral);
        return sparral;
    }


    protected static void print(String k) {
        System.out.println(k);
    }
}