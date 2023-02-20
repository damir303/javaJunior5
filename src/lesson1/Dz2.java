package lesson1;

public class Dz2 {
    public static void main(String[] args) {
        int a,b,c;
        a=3;        //сторона треугольника а
        b=6;        //сторона треугольника b
        c=39;        //сторона треугольника с
        if(a==b&&a==c&&c==b){
            System.out.println("Равносторонный");}
        else if(a!=b&&a!=c&&c!=b){
             System.out.println("Разносторонный");}
        else System.out.println("Равнобедренный");

    }
}



