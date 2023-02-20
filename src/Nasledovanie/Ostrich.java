package Nasledovanie;
// Ostrich сын
public class Ostrich extends Birds{ //Ostrich(страус) наследник Суперкласса Birds

    public Ostrich(String name) {
        super(name);
    }

    public Ostrich() {
        super();
    }

    public void hideHead() { //прятать голову в песок
        System.out.println("Я Страус и я напуган");

    }
}
