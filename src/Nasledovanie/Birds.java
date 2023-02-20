package Nasledovanie;

// SuperClass
public class Birds {   //птица
    private String name;
    private Wings wings;

    public Birds(String name) {
        this.name = name;
    }

    public Birds() {
    }

    public void walk() {  //гулять
        System.out.println("Ho-ho-ho");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
