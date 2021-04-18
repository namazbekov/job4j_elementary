package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));

        double L = h * k;

        return  L * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        double result1 = SqArea.square(8, 3);
        double result3 = SqArea.square(4, 1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        System.out.println(" p = 8, k = 3, s = 3, real = " + result1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result3);
    }
}
