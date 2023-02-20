package Nasledovanie;

public class Crow extends Birds {// Ворона

    public Crow(String name) {
        super(name);
    }

    public Crow() {
        super();
    }

    public void flay() {
        System.out.println("Я ворона, я летаю");
    }
}
