package lesson3;

public class Dz3Massive {
    public static void main(String[] args) {
        int[] a = {1, 2, 4};
        int[] b = {4, 5, 11, 22, 33, 44, 55, 66, 77, 88};
        int[] c = new int[a.length + b.length];
        boolean t = true;
        int aa = 0;
        int bb = 0;
        for (int i = 0; i < c.length; i++) {
            if (b.length > bb) {
                if (t) {
                    c[i] = a[aa];
                    aa += 1;
                    t = false;
                } else {
                    if (a.length > aa) {
                        c[i] = b[bb];
                        bb += 1;
                        t = true;
                    } else {
                        c[i] = b[bb];
                        bb += 1;
                    }
                }
            } else {
                c[i] = a[aa];
                aa += 1;
            }
            System.out.print(c[i] + " ");
        }
    }
}

