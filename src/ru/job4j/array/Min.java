package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int arr : array) {
            if (arr < min) {
                min = arr;
            }
        }
        return min;
    }
}

