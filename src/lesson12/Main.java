package lesson12;
public class Main {
    public static void main(String[] args) {
        double[][] d1 = {
                {12, 2, 3},
                {4, 5, 6},
                {7, 45, 9},
        };
        Matrix m2 = new Matrix(d1);
        m2.printToConsole();
        Matrix m3 = new Matrix(new double[][]{
                {11, 22, 33},
                {44, 5, 66},
                {77, 88, 99},
        }    );
    }
}