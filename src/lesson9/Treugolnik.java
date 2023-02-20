package lesson9;

public class Treugolnik {
    public static void main(String[] args) {
        Treugolnikk tre = new Treugolnikk();  //создали объектную переменную "tre" класса "Treugolnik"
        tre.setA(3);                      //записали число 3 в класс-Treugolnikk переменная-private int a
        tre.setB(4);
        tre.setC(5);
        int perimetr = tre.perimetr(); //запросили результат из метода "perimetr" и передали в "int perimetr"
        System.out.println("Периметр = "+ perimetr);

        int aa = tre.getA();    //запросили данные из метода public int getA() и сохранили в "int aa"
        int bb = tre.getB();
        int cc = tre.getC();
        System.out.println(aa + "" + bb +""+ cc);
    }

    public static class Treugolnikk {
       private int a;    private int b;    private int c;

        public void setA(int a) {
            this.a = a;
        }
        public void setB(int a) {
            this.b = a;
        }
        public void setC(int a) {
            this.c = a;
        }
        public int perimetr() {
            return  a+b+c;
        }
        public int getA() {   //из переменной private int a, запросили число 3, и передали в int aa - класса Treugolnik
            return a;
        }
        public int getB() {
            return b;
        }
        public int getC() {
            return c;
        }
    }
}