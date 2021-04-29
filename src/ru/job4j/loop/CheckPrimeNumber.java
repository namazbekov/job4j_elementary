package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 0; i <= number; i++) {
            if (number % 2 == 0) {
                System.out.println("не явлется простым числом");
                prime = false;
                break;
            } else {
                System.out.println("является простым числом");
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
    }
}

