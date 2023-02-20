package lesson9;

public class GeomeryFigura {
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double krug() {
        return 3.141 * (getA() * getA());
    }
    public double paral() {
        return 2 * ((getA()*getB())+(getB()*getC())+(getA()*getC()));
    }
    public double cilindr() {
        return 2*3.141*getA()*((getC()+getA()));
    }
}

