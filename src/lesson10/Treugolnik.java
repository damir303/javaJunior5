package lesson10;

public class Treugolnik {
    private int a;
    private int b;
    private int c;

    public Treugolnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) { // о-зто принимающий класс t2
        if (this == o) return true;   //this-это текущий   класс t1
        if (o == null || getClass() != o.getClass()) return false; //сравнивает название классов t1 и t2

        Treugolnik that = (Treugolnik) o; //т.к назв.классов одинаковы, данные t2 переносим в that

        if (a != that.a) return false; // сравниваем переменные "а" в t1 , с "а" в that
        if (b != that.b) return false;
        return c == that.c;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b; // 31 это случайное число
        result = 31 * result + c;
        return result;
    }

    @Override
    public String toString() {
        return "Treugolnik{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int perimetr() {
        return a + b + c;
    }
}
