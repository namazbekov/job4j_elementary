package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int result = 0;
        int[][] data = new int[size][size];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i] == data[j]) {
                     result *= data[i][j];
                }
            }
        }
        return result;
    }
}
