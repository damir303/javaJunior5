package lesson9;

public class DzFigura {
    public static void main(String[] args) {
        GeomeryFigura fig = new GeomeryFigura();
        fig.setA(3);
        fig.setB(4);
        fig.setC(6);
        System.out.println("Площадь круга с радиусом " + fig.getA() + " = " + fig.krug());
        System.out.println("Площадь параллелепипеда с длинной - " + fig.getA() + ", шириной - " + fig.getB() + ", выстой - " + fig.getC() + ",  равен =  " + fig.paral());
        System.out.println("Цилиндр = "+fig.cilindr());
    }
}