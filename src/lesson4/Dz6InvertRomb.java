package lesson4;

public class Dz6InvertRomb { public static void main(String[] args) {
    int[][] arry = new int[5][5];
    for (int i = 0; i < arry.length; i++) {
        for (int j = 0; j < arry[i].length; j++) {
            if (((i > 0 && i < arry.length - 1 && j > 0 && j < arry[i].length - 1) || arry.length/2==i || arry.length/2==j)
                    && (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1)) {
                System.out.print(arry[i][j] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}

}
