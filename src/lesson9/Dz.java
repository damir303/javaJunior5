package lesson9;

public class Dz {
    public static void main(String[] args) {
        System.out.println("""
                Выберите действие
                 1) Площадь круга
                 2) Площадь параллелепипеда
                 3) Площадь цилиндра""");
        DzRaschet obj = new DzRaschet();
        int input = DzRaschet.selectIn();
        if ( input == 1) {                      // передаем выбор для дальнейшей обработки
            DzRaschet.print("Введите радиус");
            obj.setRadius(DzRaschet.selectIn());              // передаем радиус для расчета
            DzRaschet.print("Площадь круга = " + obj.ploshadKruga(obj.getRadius())); // выполняем расчет и печать площади круга
        }
        if (input == 2) {
            DzRaschet.print("Введите длину");
            obj.setDlina(DzRaschet.selectIn());              // передаем длину для расчета площади параллелепипеда
            DzRaschet.print("Введите ширину");
            obj.setShirina(DzRaschet.selectIn());              // передаем ширину для расчета площади параллелепипеда
            DzRaschet.print("Введите высоту");
            obj.setVisota(DzRaschet.selectIn());              // передаем высоту для расчета площади параллелепипеда
            DzRaschet.print("Площадь параллелепипеда = " + obj.ploshadParall((int) obj.getRadius()));
        }
        if (input == 3) {
            DzRaschet.print("Введите радиус");
            obj.setRadius(DzRaschet.selectIn());
            DzRaschet.print("Введите высоту");
            obj.setVisota(DzRaschet.selectIn());
            DzRaschet.print("Площадь цилиндра = " + obj.ploshadCilindra(obj.getShirina()));
        }
    }

}