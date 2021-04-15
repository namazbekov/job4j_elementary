package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        return Math.sqrt(((2/(a+b+c))-a)*((2/(a+b+c))-b)*((2/(a+b+c))-c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
