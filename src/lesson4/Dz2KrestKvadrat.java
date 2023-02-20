package lesson4;

//           (!(i > 0 && i < 4 && j > 0 && j < 4))  kube
//           || arr.length/2==i || arr.length/2==j   krest
public class Dz2KrestKvadrat {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i > 0 && i < arr.length - 1 && j > 0 && j < arr[i].length - 1) || arr.length/2==i || arr.length/2==j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
