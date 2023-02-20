package lesson7;

public class Men {
    public static void main(String[] args) {
        People obj = new People();
        obj.vozrast = 20;            //Установили возраст 20 лет
        obj.name = "Vasja";          // Дали имя Вася
        System.out.println("Возраст "+ obj.name+" "+ obj.vozrast+" лет");
    }
}

