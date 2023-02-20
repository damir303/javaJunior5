package massive;

public class Massive {
    public static void main(String[] args) {
       int[][][] test = {
                {{1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2, 3}}
        };
        // цикл for..each проходит по элементам трёхмерного массива
        for (int[][] array2D : test) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.println(item);
                }
            }
        }
        // Обратите внимание на то, что у каждой строки свой ряд инициализаторов.
        int sqrs[][] = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}
        };
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}