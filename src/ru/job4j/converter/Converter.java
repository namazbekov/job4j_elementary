package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
        }

    public static int rubleToDollar(int value) {
        return value / 60;
        }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(360);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("360 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int in1 = 360;
        int expected1 = 6;
        int out = Converter.rubleToEuro(in);
        int out1 = Converter.rubleToEuro(in1);
        boolean passed = expected == out;
        boolean passed1 = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("160 rubles are 2. Test result : " + passed1);
        }
}
