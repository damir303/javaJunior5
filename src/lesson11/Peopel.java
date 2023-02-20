package lesson11;

public class Peopel extends Chelovechestvo {
    private int rost;
    private String name;
    private  String sity;

    public Peopel(int age) {
        super(age);
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public Peopel(int rost, String name, String sity) {
        this.rost = rost;
        this.name = name;
        this.sity = sity;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Peopel peopel = (Peopel) o;

        if (rost != peopel.rost) return false;
        if (!name.equals(peopel.name)) return false;
        return sity.equals(peopel.sity);
    }

    @Override
    public int hashCode() {
        int result = rost;
        result = 31 * result + name.hashCode();
        result = 31 * result + sity.hashCode();
        return result;
    }
}
