package lesson6;

//точка не должна быть вначале/конце слова, две подряд
public class Dz3 {
    public static void main(String[] args) {
        String text = "Начало проверки расположения точек";
        String[] words = text.split(" ");
        int grammatic = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(".*\\..*")) {
                grammatic++;
                System.out.println("В предложении имеется грамматическая ошибка =>" + words[i]);
            } else if (grammatic == 0 && i == words.length-1) {
                System.out.println("Ошибок нет");
            }

        }
    }
}

