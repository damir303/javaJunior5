package lesson3;

//напечатать что в массиве через ячейку и в обратном порядке
// int[] a = {32,34,12,3,5,6,73,34,76,657,56,1234}
public class Switch {
    public static void main(String[] args) {
        int[] a = {32, 34, 12, 3, 5, 6, 73, 34, 76, 657, 56, 1234};
        boolean b = true;          //ПЕРЕКЛЮЧАТЕЛЬ
        for (int i = a.length - 1; i != 0; i--) {
            if (b) {
                System.out.println(a[i]);
                b = false;
            }else {
                b =true;
            }
        }
    }
}
