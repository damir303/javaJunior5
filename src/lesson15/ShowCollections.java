package lesson15;

import java.util.ArrayList; 
public class ShowCollections {
    public static void main(String[] args) {
        CollectionUnits runits = new CollectionUnits(); // создали переменную runits и все методы стали доступны
        ArrayList<Integer> rezult = new ArrayList<>();
        rezult.add(1);
        rezult.add(2);
        rezult.add(33);
        rezult.add(4);
        rezult.add(5);
        rezult.add(6);
        rezult.add(7);
        ArrayList<Integer> rezult1 = new ArrayList<>();
        rezult1.add(1);
        rezult1.add(22);
        rezult1.add(3);
        rezult1.add(4);
        rezult1.add(5);
        rezult1.add(6);
        rezult1.add(7);
        ArrayList<Integer> unit = new ArrayList<>();
       // unit.addAll(runits.difference(rezult,rezult1));
       // unit.addAll(runits.union(rezult,rezult1));
       unit.addAll(runits.intersectionWithoutDuplicate(rezult,rezult1));


        System.out.println("1 Arreylist  "+rezult+"\n"+"2 ArreyList  "+rezult1 + "\n"+"  Rezultat   "+ unit );

    }
}
