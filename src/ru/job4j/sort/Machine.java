package ru.job4j.sort;

import java.util.Arrays;
public class Machine  {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (money >= price) {
                money = money - price;
            }
            for (int j : coins) {
                while (money >= coins[size]) {
                    money = money - coins[size];
                    rsl[index] = coins[size];
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}