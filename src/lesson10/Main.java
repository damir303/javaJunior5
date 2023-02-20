package lesson10;

public class Main {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        constructor.foo();
        Treugolnik t1 = new Treugolnik(3, 4, 5); // установка конструктора только один раз
        Treugolnik t2 = new Treugolnik(3, 4, 5);
        System.out.println(t1);
        System.out.println(t1.hashCode());
        System.out.println(t1.equals(t2)); // false - сравнивает объекты штатным equals.
        // Для того чтобы он правильно сравнивал наши объекты t1,t2 его нужно нам создать в классе,
        // где находятся эти объектные переменные.
        System.out.println(t1.equals(t2)); // true потому что сравниваем своим созданным equals
    }
}