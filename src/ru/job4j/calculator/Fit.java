package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;

    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static double womanWeight(short height1) {
        return (height1 - 110) * 1.15;

    }

    public static void main(String[] args) {
        short height = 187;
        short height1 = 162;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 162 is " + woman);
    }

}
