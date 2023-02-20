package lesson9;

import java.util.Scanner;
public class DzRaschet {
    private double radius;
    private int dlina;
    private int shirina;
    private int visota;

    public int getDlina() {
        return dlina;
    }
    public int getShirina() {
        return shirina;
    }
    public int getVisota() {
        return visota;
    }
    public void setDlina(int dlina) {
        this.dlina = dlina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public void setVisota(int visota) {
        this.visota = visota;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double ploshadKruga(double radiusRashet) {
        this.radius = Math.PI * radiusRashet * radiusRashet;
        return radius;
    }
    public int ploshadParall(int parallRashet) {
        this.radius = 2*((dlina*shirina)+(shirina*visota)+(dlina*visota));
        return (int)radius;
    }
    public int ploshadCilindra(int cilindrRashet) {
        this.shirina = (int) (2* Math.PI*radius*(radius+visota));
        return shirina;
    }
    public static int selectIn() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static void print(Object h) {
        System.out.println(h);
    }
}